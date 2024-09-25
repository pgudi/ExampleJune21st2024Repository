package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
        mouseMovement();
    }

    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            oBrowser.manage().window().maximize();
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
            oBrowser.get("https://www.flipkart.com/");
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void mouseMovement()
    {
        try
        {
            WebElement oElectronics=oBrowser.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
            Actions oMouse=new Actions(oBrowser);
            oMouse.moveToElement(oElectronics).build().perform();
            Thread.sleep(2000);
            WebElement oMens=oBrowser.findElement(By.linkText("Men's Grooming"));
            oMouse.moveToElement(oMens).build().perform();
            Thread.sleep(2000);
            WebElement oStyle=oBrowser.findElement(By.linkText("Hair Styling"));
            oMouse.click(oStyle).build().perform();
            Thread.sleep(2000);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
