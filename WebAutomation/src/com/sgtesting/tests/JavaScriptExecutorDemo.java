package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        displayURL();
        displayTitle();
        displayLinksCount();
        enterValueInTextField1();
        enterValueInTextField2();
        clickOnCheckBox1();
        clickOnCheckBox2();
        clickOnRadioButton1();
        clickOnRadioButton2();
//        clickOnButton1();
        clickOnButton2();
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
            oBrowser.get("file:///E:/GitRepository5/CurrentWorkSpace/ExampleJune21st2024Repository/WebAutomation/application/Sample.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void displayURL()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String url= (String) js.executeScript("var kk=document.URL;return kk;");
        System.out.println("URL of Application:"+url);
    }

    private static void displayTitle()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        String title= (String) js.executeScript("var kk=document.title;return kk;");
        System.out.println("Title of Application:"+title);
    }

    private static void displayLinksCount()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        long count= (long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
        System.out.println("# of Links in the Application:"+count);
    }

    private static void enterValueInTextField1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
    }

    private static void enterValueInTextField2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
        js.executeScript("arguments[0].value='WelcomeWelcome'", oEle);
    }

    private static void clickOnCheckBox1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('chk1windows').click();");
    }

    private static void clickOnCheckBox2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
        js.executeScript("arguments[0].click();", oEle);
    }

    private static void clickOnRadioButton1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('rad1chrome').click();");
    }

    private static void clickOnRadioButton2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
        js.executeScript("arguments[0].click();", oEle);
    }

    private static void clickOnButton1()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        js.executeScript("document.getElementById('btn1submit1button1').click();");
    }

    private static void clickOnButton2()
    {
        JavascriptExecutor js= (JavascriptExecutor) oBrowser;
        WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
        js.executeScript("arguments[0].click();", oEle);
    }
}
