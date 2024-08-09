package com.sgtesting.stringdemo;

public class StringOperationsDemo {
    public static void main(String[] args) {
        getCharacterCount();
        verifyIsEmpty();
        getCharacterBasedOnIndex();
        replaceDemo();
        showUppercase();
        showLowercase();
        compareString1();
        compareString2();
        existanceOfString();
        extractString();
        convertToString();
        splitDemo();
        convertToCharArray();
    }

    static void getCharacterCount()
    {
        String s="Welcome";
        int count=s.length();
        System.out.println("# of Chars :"+count);
        System.out.println("++++++++++++++++");
    }
    static void verifyIsEmpty()
    {
        String s=new String();
        boolean v1= s.isEmpty();
        System.out.println("Is Empty :"+v1);
        System.out.println("++++++++++++++++");
    }

    static void getCharacterBasedOnIndex()
    {
        String s=new String("WELCOME");
        char ch=s.charAt(1);
        System.out.println("Extracted Char :"+ch);
        System.out.println("++++++++++++++++");
    }

    static void replaceDemo()
    {
        String str="It is a new palace";
        String s=str.replace("is","was");
        System.out.println("Repalced Result:"+s);
        System.out.println("++++++++++++++++");
    }

    static void showUppercase()
    {
        String str=new String("program");
        System.out.println("Uppercase Result:"+str.toUpperCase());
        System.out.println("++++++++++++++++");
    }

    static void showLowercase()
    {
        String str=new String("LANGUAGE");
        System.out.println("Lower case Result:"+str.toLowerCase());
        System.out.println("++++++++++++++++");
    }

    static void compareString1()
    {
        String s1=new String("Springboot");
        String s2=new String("SPRINGBOOT");
        boolean v1=s1.equals(s2);
        System.out.println("Whether s1 and s2 are equal :"+v1);
        boolean v2=s1.equalsIgnoreCase(s2);
        System.out.println("Whether s1 and s2 are equal :"+v2);
        System.out.println("++++++++++++++++");
    }

    static void compareString2()
    {
        String s1=new String("Springboot");
        String s2=new String("SPRINGBOOT");
        int v1=s1.compareTo(s2);
        System.out.println("Whether s1 and s2 are equal :"+v1);
        int v2=s1.compareToIgnoreCase(s2);
        System.out.println("Whether s1 and s2 are equal :"+v2);
        System.out.println("++++++++++++++++");
    }

    static void existanceOfString()
    {
        String s="The sun raises in the east";
        boolean v1=s.startsWith("The");
        System.out.println("Starts With :"+v1);
        boolean v2=s.contains("raises");
        System.out.println("Contains :"+v2);
        boolean v3=s.endsWith("east");
        System.out.println("Ends With :"+v3);
        System.out.println("++++++++++++++++");
    }

    static void extractString()
    {
        String s=new String("Programming");
        String str1=s.substring(3);
        System.out.println(str1);
        String str2=s.substring(3, 7);
        System.out.println(str2);
        System.out.println("++++++++++++++++");
    }

    static void convertToString()
    {
        int x=350;
        String v1=String.valueOf(x);
        System.out.println(v1);
        double k=350.25;
        String v2=String.valueOf(k);
        System.out.println(v2);
        System.out.println("++++++++++++++++");
    }

    static void splitDemo()
    {
        String str="Mango,Bananna,Appple,Ornage";
        String s[]=str.split(",");
        for(String kk:s)
        {
            System.out.println(kk);
        }
        System.out.println("++++++++++++++++");
    }

    static void convertToCharArray()
    {
        String str="Welcome";
        char ch[]=str.toCharArray();
        for(char kk:ch)
        {
            System.out.println(kk);
        }
    }
}
