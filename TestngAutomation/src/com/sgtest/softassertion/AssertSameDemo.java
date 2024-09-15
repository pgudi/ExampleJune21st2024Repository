package com.sgtest.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
    public static SoftAssert softobj=new SoftAssert();
    @Test
    public void assertSameExample()
    {
        try
        {
            String s1="Welcome";
            String s2="Welcome";
            softobj.assertSame(s1, s2);
            System.out.println("This line executes after the assertSame Step...");
            softobj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotSameExample()
    {
        try
        {
            String s1=new String("Welcome");
            String s2="Welcome";
            softobj.assertNotSame(s1, s2);
            System.out.println("This line executes after the assertNotSame Step...");
            softobj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
