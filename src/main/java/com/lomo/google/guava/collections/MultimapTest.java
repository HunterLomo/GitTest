package com.lomo.google.guava.collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Date;

/**
 * Created by Administrator on 15-11-4.
 */
public class MultimapTest {
    private static final Person p = new Person(1, "name", 24, new Date());

    public static void main(String[] args) {
        Multimap<String, Person> customersByType = ArrayListMultimap.create();

        customersByType.put("abc", p);
        customersByType.put("abc", new Person(1, "name", 20, new Date()));
        customersByType.put("abc", new Person(1, "name", 20, new Date()));
        customersByType.put("abcd", new Person(2, "name", 22, new Date()));
        customersByType.put("abcde", new Person(3, "name", 24, new Date()));

        for (Person person : customersByType.get("abc")) {
            System.out.println(person.getAge());
        }

//        customersByType.remove("abc", p);
//
//        for (Person p : customersByType.values()) {
//            System.out.println(p);
//        }


        customersByType.removeAll("abc");
        for (Person p : customersByType.values()) {
            System.out.println(p);
        }
    }


}
