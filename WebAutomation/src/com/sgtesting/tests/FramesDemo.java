package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        handleFrmaes();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("file:///D:/HTML/FramesDemo.html");
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void handleFrmaes()
    {
        try
        {
            oBrowser.switchTo().frame(0);
            oBrowser.findElement(By.xpath("//input[@id='pwd1pass1word1']")).sendKeys("DemoUSer123");
            oBrowser.switchTo().defaultContent();
            Thread.sleep(4000);
            oBrowser.switchTo().frame("tbl_page");
            oBrowser.findElement(By.id("edit1")).sendKeys("22000");
            oBrowser.switchTo().defaultContent();
            Thread.sleep(4000);
            WebElement oFrame=oBrowser.findElement
                    (By.xpath("//iframe[@title='sample']"));
            oBrowser.switchTo().frame(oFrame);
            oBrowser.findElement(By.id("btn1submit1button1")).click();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
