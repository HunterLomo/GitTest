package com.lomo.google.guava.collections;

import com.google.common.base.Splitter;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Created by Administrator on 15-11-4.
 */
public class MultisetTest {
    public static void main(String[] args) {
        Multiset<String> multiset2 = HashMultiset.create();
        String str = "hello beijing, nice to meet u";
        Iterable<String> iterator = Splitter.onPattern("[^a-z]{1,}").omitEmptyStrings().trimResults().split(str);
        for (String ss : iterator) {
            multiset2.add(ss);
        }
        System.out.println(multiset2);


//
//        Multiset<String> multiset = HashMultiset.create();
//        multiset.add("a");
//        multiset.add("b");
//        multiset.add("a");
//        multiset.add("d");
//        System.out.println(multiset.size());
//        System.out.println(multiset.elementSet().size());
//        System.out.println(multiset.count("a"));
//
//        multiset.add("a");
//        System.out.println(multiset.count("a"));

    }

}
