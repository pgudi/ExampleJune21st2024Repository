package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutWebElementDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();

    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
           oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("DemoUser2");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("DemoUser3");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("DemoUser4");
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).clear();
            Thread.sleep(1000);
            oBrowser.findElement(By.id("username")).sendKeys("DemoUser1");
            Thread.sleep(1000);
            String content=oBrowser.findElement(By.id("username")).getAttribute("value");
            System.out.println(content);
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
