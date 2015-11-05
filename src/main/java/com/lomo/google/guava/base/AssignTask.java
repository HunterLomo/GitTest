package com.lomo.google.guava.base;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Administrator on 15-11-3.
 */
public class AssignTask {
    public static void main(String[] args) {
        List<String> list1 = Lists.newArrayList("员工入职流程表", "人事异动单", "需用人员申请表");
//        List<String> list1 = new ArrayList<String>();
//        list1.add("员工入职流程表");
//        list1.add("人事异动单");
//        list1.add("需用人员申请表");
        List<String> list2 = Lists.newArrayList("Y", "C", "M");
//        List<String> list2 = new ArrayList<String>();
//        list2.add("Y");
//        list2.add("C");
//        list2.add("M");

        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * list1.size());
            int index2 = (int) (Math.random() * list2.size());
            System.out.println(list1.get(index) + " :  " + list2.get(index2));

            list1.remove(list1.get(index));
            list2.remove(list2.get(index2));

        }

    }
}
