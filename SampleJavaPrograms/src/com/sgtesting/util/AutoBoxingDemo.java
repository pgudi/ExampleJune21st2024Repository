package com.sgtesting.util;
public class AutoBoxingDemo {
    public static void main(String[] args) {

        int a=35;
        System.out.println("int a :"+a);

        //Convert int into Wrapper object
        Integer b=Integer.valueOf(a);
        System.out.println("Integer b:"+b);

        //Auto boxing
        Integer c=a;
        System.out.println("Integer c:"+c);
    }
}
