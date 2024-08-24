package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
    public static void main(String[] args) {
     //   matchesDemo();
     //   findDemo();
     //   countOfMatchingPattern();
     //   displayMatch();
     //   displayStartAndEndPositionOfMatch();
     //   repalceDemo();
        splitDemo();
    }

    private static void matchesDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome");
        boolean v1=match.matches();
        System.out.println(v1);
    }

    private static void findDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome To Our Web Application Welcome");
        boolean v1=match.find();
        System.out.println(v1);
    }

    private static void countOfMatchingPattern()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome Hello Hi Bye Welcome Hey Welcome");
        int count=0;
        while(match.find())
        {
            count=count+1;
        }
        System.out.println("# of Count :"+count);
    }

    private static void displayMatch()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome Hello Hi Bye Welcome Hey Welcome");

        while(match.find())
        {
            System.out.println(match.group());
        }
    }

    private static void displayStartAndEndPositionOfMatch()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome Hello Hi Bye Welcome Hey Welcome");

        while(match.find())
        {
            System.out.println(match.group()+" Start Pos :"+match.start()+" end Pos :"+match.end());
        }
    }

    private static void repalceDemo()
    {
        Pattern pattern=Pattern.compile("Welcome");
        Matcher match =pattern.matcher("Welcome Hello Hi Bye Welcome Hey Welcome");

        String v1=match.replaceAll("Program");
        System.out.println(v1);
    }

    private static void splitDemo()
    {
        Pattern pattern=Pattern.compile("[!@#$%^]");
        String str="Mango!Ornage@grapes#Banan$Apple%Watermelon^Kiwi";

        String s[]=pattern.split(str);
        for(String kk:s)
        {
            System.out.println(kk);
        }
    }
}
