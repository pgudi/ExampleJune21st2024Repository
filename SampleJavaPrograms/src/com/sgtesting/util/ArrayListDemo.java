package com.sgtesting.util;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
     //   addElements();
     //     removeElements();
     //   readElements1();
     //    readElements2();
     //   readElementsByIterator();
        withOutGenerics();
    }
    private static void addElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add(1,"Watermelon");
        System.out.println("Elements :"+obj);
        ArrayList<String> obj1=new ArrayList<String>();
        obj1.add("Green");
        obj1.add("Blue");
        obj1.add("White");
        obj.addAll(obj1);
        System.out.println("Elements :"+obj);
    }

    private static void removeElements()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add(1,"Watermelon");
        System.out.println("Elements :"+obj);
        obj.remove(1);
        System.out.println("Elements :"+obj);
        obj.remove("Banana");
        System.out.println("Elements :"+obj);
        obj.removeAll(obj);
        System.out.println("Elements :"+obj);
    }

    private static void readElements1()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(String str: obj)
        {
            System.out.println(str);
        }
    }

    private static void readElements2()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

    private static void readElementsByIterator()
    {
        ArrayList<String> obj=new ArrayList<String>();
        System.out.println("Elements :"+obj);
        obj.add("Mango");
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Mango");
        obj.add("Banana");
        obj.add("Pineapple");
        obj.add("Watermelon");
        System.out.println("Elements :"+obj);

        Iterator<String> ite=obj.iterator();
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }
    }

    private static void withOutGenerics()
    {
        ArrayList obj=new ArrayList();
        System.out.println("Elements :"+obj);
        obj.add(45);
        obj.add(true);
        obj.add("Mango");
        obj.add(10.175);
        obj.add('Y');
        obj.add("Bangalore");
        System.out.println("Elements :"+obj);
    }
}
