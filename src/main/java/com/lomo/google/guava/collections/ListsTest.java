package com.lomo.google.guava.collections;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.List;

/**
 * Created by Administrator on 15-11-4.
 */
public class ListsTest {
    public static void main(String[] args) {
        List countUp = Ints.asList(1, 2, 3, 4, 5);
        List countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        List<List> parts = Lists.partition(countUp, 2);//{{1,2}, {3,4}, {5}}
        System.out.println(countUp);
        System.out.println(countDown);
        System.out.println(parts);
    }
}
