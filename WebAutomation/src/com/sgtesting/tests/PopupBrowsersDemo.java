package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        popupBrowsers();
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

    private static void popupBrowsers()
    {
        try
        {
            System.out.println("Before Click on Link , Number of Popups :"+getPopupsCount());
            Thread.sleep(2000);
            WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
            oLink.click();
            Thread.sleep(2000);
            System.out.println("After Click on Link , Number of Popups :"+getPopupsCount());
            if(getPopupsCount()>0)
            {
                handlePopups();
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static int getPopupsCount()
    {
        int count=0;
        count=oBrowser.getWindowHandles().size()-1;
        return count;
    }

    private static void handlePopups()
    {
        try
        {
            String parentBrowser=oBrowser.getWindowHandle();
            System.out.println("Parent Browser:"+parentBrowser);
            Object popups[]=oBrowser.getWindowHandles().toArray();
            for(int i=1;i<popups.length;i++)
            {
                String childBrowser=popups[i].toString();
                System.out.println("Child Browser :"+childBrowser);
                oBrowser.switchTo().window(childBrowser);
                Thread.sleep(2000);
                String url=oBrowser.getCurrentUrl();
                System.out.println("URL :"+url);
                String title=oBrowser.getTitle();
                System.out.println("Title:"+title);
                Thread.sleep(4000);
                oBrowser.findElement(By.xpath("//button[text()='Accept']")).click();
                Thread.sleep(4000);
                oBrowser.findElement(By.xpath("//div[@class='header__burger']")).click();
                Thread.sleep(4000);
                oBrowser.findElement(By.linkText("Try Free")).click();
                Thread.sleep(2000);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
