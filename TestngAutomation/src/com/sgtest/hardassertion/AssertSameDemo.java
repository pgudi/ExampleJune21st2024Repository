package com.sgtest.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {

    @Test
    public void assertSameExample()
    {
        try
        {
            String s1="Welcome";
            String s2="Welcome";
            Assert.assertSame(s1, s2);
            System.out.println("This line executes after the assertSame Step...");
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
            Assert.assertNotSame(s1, s2);
            System.out.println("This line executes after the assertNotSame Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
