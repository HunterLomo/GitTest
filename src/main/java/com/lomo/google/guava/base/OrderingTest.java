package com.lomo.google.guava.base;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.lomo.google.guava.collections.Person;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 15-11-3.
 */
public class OrderingTest {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1123, 2, 5, 76, null, 100);
        Ordering ordering = Ordering.natural();
        List<Integer> listResult = ordering.nullsFirst().sortedCopy(list);
        List<Integer> listResult2 = ordering.nullsLast().reverse().sortedCopy(list);
        System.out.println(listResult);
        System.out.println(listResult2);

        System.out.println(Ints.compare(62, 4));


        List<Person> personList = Lists.newArrayList(
                new Person(1111, "name", 33, new Date()),
                new Person(1111, "name", 123, new Date()),
                new Person(1111, "name", 2440, new Date()),
                new Person(1111, "name", 3, new Date()),
                new Person(1111, "name", 333, new Date()),
                new Person(1111, "name", 44, new Date()),
                new Person(1111, "name", 55, new Date())
        );


        Ordering<Person> byAge = new Ordering<Person>() {
            @Override
            public int compare(Person left, Person right) {
                return right.getAge() - left.getAge();
            }
        };

        for (Person p : byAge.immutableSortedCopy(personList)) {
            System.out.println(p);
        }
        System.out.println(byAge.nullsFirst().reverse().sortedCopy(personList));

    }


}
