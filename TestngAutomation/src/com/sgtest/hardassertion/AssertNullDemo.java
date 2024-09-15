package com.sgtest.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class AssertNullDemo {

    @Test
    public void assertNullExample()
    {
        try
        {
            File obj=null;
            Assert.assertNull(obj);
            System.out.println("This line executes after the assertNull Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void assertNotNullExample()
    {
        try
        {
            File obj=null;
            obj=new File("E:\\Example");
            Assert.assertNotNull(obj);
            System.out.println("This line executes after the assertNotNull Step...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
