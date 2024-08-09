package com.sgtesting.stringdemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        appendDemo();
        insertDemo();
        deleteDemo();
        reverseStrDemo();
    }

    static void appendDemo()
    {
        StringBuffer s=new StringBuffer("Java");
        s.append(" Programming");
        System.out.println(s);
        System.out.println("++++++++++++++");
    }

    static void insertDemo()
    {
        StringBuffer s=new StringBuffer("It is a book");
        s.insert(8,"new ");
        System.out.println(s);
        System.out.println("++++++++++++++");
    }

    static void deleteDemo()
    {
        StringBuffer s=new StringBuffer("It is a new book");
        s.delete(8,12);
        System.out.println(s);
        System.out.println("++++++++++++++");
    }

    static void reverseStrDemo()
    {
        StringBuffer s=new StringBuffer("Welcome");
        s.reverse();
        System.out.println(s);
        System.out.println("++++++++++++++");
    }
}
