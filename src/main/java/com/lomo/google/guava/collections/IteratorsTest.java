package com.lomo.google.guava.collections;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Lomo on 15-11-6.
 * Study Guava
 */
public class IteratorsTest {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("Asdf", "Ad", "AddddADddddd", "ACdd", "Adddd");
        List<String> list2 = Lists.newArrayList("Asdf", "d", "Ddd", "Cdd", "dddd");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.startsWith("A");
            }
        };
        System.out.println(Iterators.all(list.iterator(), predicate));
        System.out.println(Iterators.all(list2.iterator(), predicate));

        System.out.println(Iterators.any(list2.iterator(), predicate));//任何一个

        Iterator<String> iterator = Iterators.filter(list.iterator(), new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.length() > 4;
            }
        });
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        String iterator1 = Iterators.find(list.iterator(), new Predicate<String>() {//第一个d结尾
            @Override
            public boolean apply(String input) {
                return input.endsWith("d");
            }
        });
        System.out.println(iterator1);

        Iterator<Integer> iterator2 = Iterators.transform(list.iterator(), new Function<String, Integer>() {
            @Override
            public Integer apply(String input) {
                return input.length();
            }
        });
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        Iterator<String> iterator3 = Iterators.transform(list.iterator(), new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.substring(1);
            }
        });
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

    }
}
