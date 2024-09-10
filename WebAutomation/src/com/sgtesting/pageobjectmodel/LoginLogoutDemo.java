package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
    public static WebDriver oBrowser=null;
    public static ActiPage oPage=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        login();
        minimizeFlyOutwindow();
        logout();
        closeApp();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oPage=new ActiPage(oBrowser);
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
            oPage.getUsername().sendKeys("admin");
            oPage.getPassword().sendKeys("manager");
            oPage.getLoginIn().click();
            Thread.sleep(5000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void minimizeFlyOutwindow()
    {
        try
        {
            oPage.getFlyOutWindow().click();
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
            oPage.getLogout().click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void closeApp()
    {
        try
        {
            oBrowser.quit();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
