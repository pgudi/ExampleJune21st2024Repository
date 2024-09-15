package com.sgtest.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertConditionDemo {

    @Test
    public void assertTrueDemo()
    {
        int x,y;
        try
        {
            x=35;y=55;
            Assert.assertTrue(x<=y);
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
            Assert.assertFalse(x>=y);
            System.out.println("This line executes after the assertFalse Step...");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
