package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
     //   absoluteXPath();
     //   relativeXPathByTagNameAlone();
     //   relativeXPathByTagNameWithIndex();
        relativeXPathByTagNameWithAttributeNameValue();
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
            oBrowser.get("file:///D:/HTML/Sample.html");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void absoluteXPath()
    {
        oBrowser.findElement(By.xpath("/html/body/div/form/input")).sendKeys("admin123");

    }

    /**
     * case 1: identify Element based in tagName
     * syntax: //<tagName>
     */
    private static void relativeXPathByTagNameAlone()
    {
        oBrowser.findElement(By.xpath("//input")).sendKeys("admin");

    }

    /**
     * case 2: identify Element based in tagName with index
     * syntax: //<tagName>[index]
     */
    private static void relativeXPathByTagNameWithIndex()
    {
        oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Welcome123");

    }

    /**
     * case 3: identify Element based in tagName with attribute name and value
     * syntax: //<tagName>[@attributeName='attributeValue']
     */
    private static void relativeXPathByTagNameWithAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();

    }

}
