package com.sgtesting.stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        appendString();
        insertDemo();
        deleteDemo();
        reverseStrDemo();
    }

    private static void appendString()
    {
        StringBuilder s=new StringBuilder("Java");
        s.append(" Programming");
        System.out.println(s);
        System.out.println("++++++++++++++++++++");
    }

    private static void insertDemo()
    {
        StringBuilder s=new StringBuilder("It is a book");
        s.insert(8,"new ");
        System.out.println(s);
        System.out.println("++++++++++++++");
    }

    private static void deleteDemo()
    {
        StringBuilder s=new StringBuilder("It is a new book");
        s.delete(8,12);
        System.out.println(s);
        System.out.println("++++++++++++++");
    }

    private static void reverseStrDemo()
    {
        StringBuilder s=new StringBuilder("Welcome");
        s.reverse();
        System.out.println(s);
        System.out.println("++++++++++++++");
    }
}
