package com.lomo.google.guava.reflect;

import com.lomo.google.guava.base.PreconditionsTest;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Lomo on 15-11-10.
 * Study Guava
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException {
//        List<String> stirngList = Lists.newArrayList();
//        List<Integer> integerList = Lists.newArrayList();
//        System.out.println(stirngList.getClass());
//        System.out.println(integerList.getClass());
//        System.out.println(stirngList.getClass().isAssignableFrom(integerList.getClass()));
//
//        TypeToken typeTokenList = new TypeToken<ArrayList<String>>(){};
//        TypeToken<?> typeToken = typeTokenList.resolveType(ArrayList.class.getTypeParameters()[0]);
//        System.out.println(typeToken.getType());


//        Method[] methods = PreconditionsTest.class.getMethods();
//        for(Method method : methods){
//            System.out.println(method.getName());
//        }
        Method method2 = PreconditionsTest.class.getMethod("doSomething", String.class, int.class, String.class);
        System.out.println(method2);
        System.out.println(Modifier.isPublic(method2.getModifiers()));

    }
}
