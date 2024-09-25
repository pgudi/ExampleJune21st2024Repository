package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
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
            oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
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
            oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            oBrowser.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void login()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
