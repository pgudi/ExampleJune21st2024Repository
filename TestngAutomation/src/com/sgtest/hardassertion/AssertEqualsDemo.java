package com.sgtest.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {

    @Test(enabled=false)
    public void assertEqualsExample()
    {
        String s1,s2;
        try
        {
            s1="Welcome";
            s2="Welcome1";
            Assert.assertEquals(s1,s2);
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
            Assert.assertNotEquals(s1,s2);
            System.out.println("This line executes after the assertNotEquals Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
