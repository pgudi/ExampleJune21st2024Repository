package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserScenario {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyoutWindow();
        createUser();
        deleteUser();
        logout();
        closeApp();
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
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyoutWindow()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void createUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.name("firstName")).sendKeys("admin");
            oBrowser.findElement(By.name("lastName")).sendKeys("User1");
            oBrowser.findElement(By.name("email")).sendKeys("demo@gss.com");
            oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
            oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
            oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
            Thread.sleep(2000);
            oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void deleteUser()
    {
        try
        {
            oBrowser.findElement(By.xpath("//span[text()='User1, admin']")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
            Thread.sleep(2000);
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void logout()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApp()
    {
        try
        {
            oBrowser.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
