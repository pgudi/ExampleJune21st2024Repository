package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemsFromDropDownDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        selectItems();
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
            oBrowser.get("file:///E:/GitRepository5/CurrentWorkSpace/ExampleJune21st2024Repository/WebAutomation/application/WebTableHTML.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void selectItems()
    {
        try
        {
            WebElement oList=oBrowser.findElement(By.id("list1"));
            Select oSelect=new Select(oList);
            oSelect.selectByVisibleText("Rajasthan");
            Thread.sleep(1000);
            oSelect.selectByIndex(1);
            Thread.sleep(1000);
            oSelect.selectByValue("pj");
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
