package com.lomo.google.guava.base;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.lomo.google.guava.collections.Person;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 15-11-3.
 * <p/>
 * 创建Optional实例（以下都是静态方法）：
 * <p/>
 * Optional.of(T)	创建指定引用的Optional实例，若引用为null则快速失败
 * Optional.absent()	创建引用缺失的Optional实例
 * Optional.fromNullable(T)	创建指定引用的Optional实例，若引用为null则表示缺失
 * <p/>
 * 用Optional实例查询引用（以下都是非静态方法）：
 * <p/>
 * boolean isPresent()	如果Optional包含非null的引用（引用存在），返回true
 * T get()	返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
 * T or(T)	返回Optional所包含的引用，若引用缺失，返回指定的值
 * T orNull()	返回Optional所包含的引用，若引用缺失，返回null
 * Set<T> asSet()	返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<Person> optional_person = Optional.of(new Person(33999, "name1", 33, new Date()));
        System.out.println(optional_person.get());
//        Optional<String> optional_person_name = Optional.of(new Person().getName());
//        System.out.println(optional_person_name.get());//name为null
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");//name为null

        List<String> list = Lists.newArrayList("111", "222");
        Optional<List<String>> optional = Optional.of(list);
        System.out.println(optional.get());
        System.out.println(list);

//        List<String> list2 = Lists.newArrayList("333","444");
        List<String> list2 = Lists.newArrayList(null);
        List<String> list3 = Lists.newArrayList("333", "444", "555", "666");
        List<String> optional2 = Optional.fromNullable(list2).or(list3);
        System.out.println(optional2);

        System.out.println(Optional.fromNullable(null).or("222"));
        System.out.println(Optional.fromNullable("111").or("222"));
        System.out.println(Objects.firstNonNull(null, "222"));
        System.out.println(Objects.firstNonNull("111", "222"));

        System.out.println(getValue(null, "请选择xxx"));
        System.out.println(getValue("abc", "请选择xxx"));


        Optional<ImmutableMultiset<String>> optional3 = Optional.fromNullable(testTransform());

        if (optional3.isPresent()) {
            for (String p : optional3.get()) {
                System.out.println("名字：" + p);
            }
        }

        System.out.println(optional3.isPresent());


        Optional<ImmutableMultiset<Person>> optional4 = Optional.fromNullable(testPredict());

        if (optional4.isPresent()) {
            for (Person p : optional4.get()) {
                System.out.println("ID1111的：" + p);
            }
        }

        System.out.println(optional4.isPresent());

    }

    /**
     * 取值，如果result为null，则返回ifNull
     *
     * @param result
     * @param ifNull
     * @return
     */
    public static String getValue(String result, String ifNull) {
        return Optional.fromNullable(result).or(ifNull);
    }


    public static ImmutableMultiset<String> testTransform() {
        List<Person> personList = Lists.newArrayList(
                new Person(1111, "name1", 33, new Date()),
                new Person(1111, "name2", 123, new Date()),
                new Person(1111, "name99", 2440, new Date()),
                new Person(1111, "name5", 3, new Date()),
                new Person(1111, "name6", 333, new Date()),
                new Person(1111, "name7", 44, new Date()),
                new Person(1111, "name8", 55, new Date()));

        return ImmutableMultiset.copyOf(Lists.transform(personList, new Function<Person, String>() {
            @Override
            public String apply(Person input) {
                return input.getName();
            }
        }));
    }


    public static ImmutableMultiset<Person> testPredict() {
        List<Person> personList = Lists.newArrayList(
                new Person(2222, "name1", 33, new Date()),
                new Person(1111, "name2", 123, new Date()),
                new Person(3333, "name99", 2440, new Date()),
                new Person(114411, "name5", 3, new Date()),
                new Person(55, "name6", 333, new Date()),
                new Person(1111, "name7", 44, new Date()),
                new Person(1111, "name8", 55, new Date()));

        return ImmutableMultiset.copyOf(Collections2.filter(personList, new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getId() == 1111;
            }
        }));
    }
}
