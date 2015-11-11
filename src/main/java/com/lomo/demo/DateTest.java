package com.lomo.demo;

import java.util.Calendar;

/**
 * Created by Lomo on 15-11-9.
 * Study Guava
 */
public class DateTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2011, 4, 1);
        Calendar calendar2 = Calendar.getInstance();
        long cha = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        System.out.println(cha / 1000 / 60 / 60 / 24);
    }
}
