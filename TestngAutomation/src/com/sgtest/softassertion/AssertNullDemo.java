package com.sgtest.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

public class AssertNullDemo {
    public static SoftAssert softobj=new SoftAssert();
    @Test
    public void assertNullExample()
    {
        try
        {
            File obj=new File("D:\\");
            softobj.assertNull(obj);
            System.out.println("This line executes after the assertNull Step...");
            softobj.assertAll();
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
      //      obj=new File("E:\\Example");
            softobj.assertNotNull(obj);
            System.out.println("This line executes after the assertNotNull Step...");
            softobj.assertAll();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
