package com.lomo.google.guava.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 15-11-4.
 */
public class TableTest {
    public static void main(String[] args) {
        Table<Integer, Integer, Person> personTable = HashBasedTable.create();
        personTable.put(1, 20, new Person(1111, "name", 20, new Date()));
        personTable.put(0, 30, new Person(1, "name", 20, new Date()));
        personTable.put(0, 25, new Person(1, "name", 20, new Date()));
        personTable.put(1, 50, new Person(1, "name", 20, new Date()));
        personTable.put(0, 27, new Person(1, "name", 20, new Date()));
        personTable.put(1, 29, new Person(1, "name", 20, new Date()));
        personTable.put(0, 33, new Person(1, "name", 20, new Date()));
        personTable.put(1, 66, new Person(1, "name", 20, new Date()));

//1,得到行集合
        Map<Integer, Person> rowMap = personTable.row(1);
        int maxAge = Collections.max(rowMap.keySet());
        System.out.println(maxAge);

        System.out.println(personTable.get(1, 20));
        System.out.println(personTable.get(0, 30));

    }
}
