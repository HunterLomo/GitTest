package com.lomo.google.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;

/**
 * Created by Lomo on 15-11-6.
 * Study Guava
 */
public class BiMapTest {
    public static void main(String[] args) {
        BiMap<String, String> map = HashBiMap.create();
        map.put("a", "a1");
        map.put("b", "b1");
        map.put("c", "c1");
        map.put("d", "d1");
        map.put("e", "e1");
        map.put("f", "f1");
        System.out.println(map.entrySet());
        System.out.println(map.get("a"));
        System.out.println(map.inverse().get("b1"));

        String[] a = new String[10];
        for (int i = 0; i < 6; i++) {
            a[i] = "abc" + i;
        }
        System.out.println(Arrays.asList(a));
    }


}
