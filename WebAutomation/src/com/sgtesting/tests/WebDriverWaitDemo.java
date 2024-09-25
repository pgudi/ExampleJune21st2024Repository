package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitDemo {
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
            WebDriverWait wait=new WebDriverWait(oBrowser, Duration.ofSeconds(30));
            WebElement oEle=oBrowser.findElement(By.name("username"));
            wait.until(ExpectedConditions.attributeContains(oEle,"placeholder","Username"));
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
