package com.lomo.google.guava.base;

import com.google.common.base.Objects;
import com.lomo.demo.HelloGit;

/**
 * Created by Administrator on 15-11-3.
 */
public class ObjectsTest {
    public static void main(String[] args) {
        System.out.println(Objects.equal(null, null));
        System.out.println(Objects.equal(null, 1));


        System.out.println(Objects.hashCode(HelloGit.class));
    }
}
