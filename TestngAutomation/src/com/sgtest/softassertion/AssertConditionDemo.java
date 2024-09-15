package com.sgtest.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConditionDemo {
    public static SoftAssert obj=new SoftAssert();
    @Test
    public void assertTrueDemo()
    {
        int x,y;
        try
        {
            x=35;y=55;
            obj.assertTrue(x<=y);
            obj.assertAll();
            System.out.println("This line executes after the assertTrue Step...");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertFalseDemo()
    {
        int x,y;
        try
        {
            x=35;y=55;
            obj.assertFalse(x>=y);
            obj.assertAll();
            System.out.println("This line executes after the assertFalse Step...");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
