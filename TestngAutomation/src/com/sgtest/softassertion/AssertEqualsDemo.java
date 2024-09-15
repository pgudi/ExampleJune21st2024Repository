package com.sgtest.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
    public static SoftAssert obj=new SoftAssert();
    @Test
    public void assertEqualsExample()
    {
        String s1,s2;
        try
        {
            s1=new String("Welcome");
            s2="Welcome";
            obj.assertEquals(s1,s2);
            obj.assertAll();
            System.out.println("This line executes after the assertEquals Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotEqualsExample()
    {
        String s1,s2;
        try
        {
            s1="Welcome";
            s2="WELCOME";
            obj.assertNotEquals(s1,s2);
            obj.assertAll();
            System.out.println("This line executes after the assertNotEquals Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
