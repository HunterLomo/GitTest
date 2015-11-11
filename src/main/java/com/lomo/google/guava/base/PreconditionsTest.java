package com.lomo.google.guava.base;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.sun.istack.internal.Nullable;

import java.util.List;

/**
 * Created by Administrator on 15-11-3.
 * <p/>
 * <p/>
 * 方法声明（不包括额外参数）	                描述	                                                                            检查失败时抛出的异常
 * checkArgument(boolean)	                    检查boolean是否为true，用来检查传递给方法的参数。	                                IllegalArgumentException
 * checkNotNull(T)	                        检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。	        NullPointerException
 * checkState(boolean)	                    用来检查对象的某些状态。	                                                        IllegalStateException
 * checkElementIndex(int index, int size)	    检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *	    IndexOutOfBoundsException
 * checkPositionIndex(int index, int size)	检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *	    IndexOutOfBoundsException
 * checkPositionIndexes(int start, int end, int size)	检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*	            IndexOutOfBoundsException
 */
public class PreconditionsTest {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("1", "2", "3", "4");
        List<String> list2 = null;
        System.out.println(list.subList(0, 3));//前包，后不包
        System.out.println(Preconditions.checkNotNull(list));
        System.out.println(Preconditions.checkNotNull(list2));

        PreconditionsTest demo = new PreconditionsTest();
        demo.doSomething("Jim", 19, "hello world, hello java");

    }

    @Nullable
    public void doSomething(@Nullable String name, int age, String desc) {
        Preconditions.checkNotNull(name, "name may not be null");
        Preconditions.checkArgument(age >= 18 && age < 99, "age must in range (18,99)");
        Preconditions.checkArgument(desc != null && desc.length() < 10, "desc too long, max length is ", 10);

        //do things
    }
}
