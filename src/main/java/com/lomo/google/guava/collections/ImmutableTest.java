package com.lomo.google.guava.collections;

import com.google.common.collect.ImmutableSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 15-11-4.
 */
public class ImmutableTest {
    public static void main(String[] args) {

        Set<String> set2 = ImmutableSet.<String>builder().add("1", "11", "111").build();
        for (String s : set2) {
            System.out.println(s);
        }


        ImmutableSet<String> immutableSet = ImmutableSet.of("a", "ab", "abc", "abcd");
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println("........................");
        immutableSet = ImmutableSet.copyOf(new String[]{"c", "d", "ddd"});
        for (String a : immutableSet) {
            System.out.println(a);
        }
        immutableSet.add("abbb");
        System.out.println("........................");

//        System.out.println("immutableSet：" + immutableSet.asList());
//        System.out.println("set的大小：" + set);
////        immutableSet.clear();//exception
//        set.clear();
//        System.out.println("immutableSet清空后：" + immutableSet.asList());
//        System.out.println("set清空后的大小：" + set.size());
    }
}
