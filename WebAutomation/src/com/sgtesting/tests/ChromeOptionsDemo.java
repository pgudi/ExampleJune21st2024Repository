package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    }

    private static void launchBrowser()
    {
        try
        {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized");
            oBrowser=new ChromeDriver(options);
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void navigateURL()
    {
        try
        {
            oBrowser.get("https://www.axisbank.com/");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
