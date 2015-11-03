package com.lomo.google.guava;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

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


    }
}
