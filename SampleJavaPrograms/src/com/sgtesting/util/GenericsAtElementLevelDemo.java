package com.sgtesting.util;
class Demo
{
    public static <E> void readElements(E[] elements)
    {
        for(E element : elements)
        {
            System.out.println(element);
        }
    }
}
public class GenericsAtElementLevelDemo {
    public static void main(String[] args) {
        Integer[] a={10,20,30,40};
        Demo.readElements(a);

        String[] s={"Mango","Apple","Orange"};
        Demo.readElements(s);

        Character[] ch={'P','Q','R'};
        Demo.readElements(ch);
    }
}
