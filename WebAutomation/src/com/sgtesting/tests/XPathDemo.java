package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.List;

public class XPathDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
     //   absoluteXPath();
     //   relativeXPathByTagNameAlone();
     //   relativeXPathByTagNameWithIndex();
     //   relativeXPathByTagNameWithAttributeNameValue();
     //   relativeXPathByAttributeNameValue();
     //   relativeXPathByAttributeValue();
     //   relativeXPathByTagNameWithMultipleAttributeNameValue();
     //   relativeXPathByTagNameWithMultipleAttributeNameValueUsingOROperator();
     //   relativeXPathByTagNameWithMultipleAttributeNameValueUsingAndOperator();
     //   relativeXPathByTagNameWithAttributeName();
     //   relativeXPathByTagNameWithAttributeName_01();
     //   relativeXPathByTagNameWithAttributeName_02();
        relativeXPathByTagNameWithAttributeName_03();
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

    /**
     * case 4: identify Element based in attribute name and value
     * syntax: //*[@attributeName='attributeValue']
     */
    private static void relativeXPathByAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();

    }

    /**
     * case 5: identify Element based in attribute value
     * syntax: //*[@*='attributeValue']
     */
    private static void relativeXPathByAttributeValue()
    {
        oBrowser.findElement(By.xpath("//*[@*='Submit']")).click();
    }

    /**
     * case 6: identify Element based in tagName with Multiple attribute name and value
     * syntax: //<tagName>[@attributeName1='attributeValue'][@attributeName2='attributeValue']
     */
    private static void relativeXPathByTagNameWithMultipleAttributeNameValue()
    {
        oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();

    }

    /**
     * case 7: identify Element based in tagName with Multiple attribute name and value using or operator
     * syntax: //<tagName>[@attributeName1='attributeValue' or @attributeName2='attributeValue']
     */
    private static void relativeXPathByTagNameWithMultipleAttributeNameValueUsingOROperator()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();

    }

    /**
     * case 8: identify Element based in tagName with Multiple attribute name and value using and operator
     * syntax: //<tagName>[@attributeName1='attributeValue' and @attributeName2='attributeValue']
     */
    private static void relativeXPathByTagNameWithMultipleAttributeNameValueUsingAndOperator()
    {
        oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
    }

    /**
     * case 9: identify Element based in tagName with attribute name
     * syntax: //<tagName>[@attributeName1='attributeValue' and @attributeName2='attributeValue']
     */
    private static void relativeXPathByTagNameWithAttributeName()
    {
        // Find Number of Links in the application
        List<WebElement> lists=oBrowser.findElements(By.xpath("//a[@href]"));
        System.out.println("# of Links :"+ lists.size());
    }

    private static void relativeXPathByTagNameWithAttributeName_01()
    {
        // Display Link Names  in the application
        List<WebElement> lists=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<lists.size();i++)
        {
            WebElement link=lists.get(i);
            String linkname=link.getText();
            System.out.println(linkname);
        }
    }

    private static void relativeXPathByTagNameWithAttributeName_02()
    {
        // Display Link Names  in the application
        List<WebElement> lists=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<lists.size();i++)
        {
            WebElement link=lists.get(i);
            String linkname=link.getText();
            if(link.getText().startsWith("POI"))
            {
                link.click();
                break;
            }
        }
    }


    private static void relativeXPathByTagNameWithAttributeName_03()
    {
        // org.openqa.selenium.StaleElementReferenceException: stale element reference:
        // stale element not found
        List<WebElement> lists=oBrowser.findElements(By.xpath("//a[@href]"));
        for(int i=0;i<lists.size();i++)
        {
            WebElement link=lists.get(i);
            String linkname=link.getText();
            if(link.getText().startsWith("POI"))
            {
                link.click();
            }
        }
    }


}
