package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CSSSelectorDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
    //    absoluteCssPath();
    //    relativeCSSTagNameAlone();
    //    relativeCSSTagNameWithIdAttributeValue();
    //    relativeCSSWithIdAttributeValue();
    //    relativeCSSTagNameWithClassAttributeValue();
    //    relativeCSSWithClassAttributeValue();
    //    relativeCSSWithTagNameAndAttributeNameValueCombination();
    //    relativeCSSWithTagNameAndMultipleAttributeNameValueCombination();
    //    relativeCSSWithTagNameAndAttributeName();
    //    relativeCSSWithTagNameAndAttributeName_01();
    //    relativeCSSWithTagNameAndAttributeName_02();
    //    relativeCSSWithTagNameAndAttributeName_03();
    //    relativeCSSWithPartialMatchingOfAttributeValue();
    //    relativeCSSWithNthChildConcept();
        relativeCSSWithSiblingConcept();
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

    private static void absoluteCssPath()
    {
        oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
    }

    /**
     * case 1: Identify the Element based on tagName
     * syntax: <tagName>
     */
    private static void relativeCSSTagNameAlone()
    {
        oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser2");
    }

    /**
     * case 2: Identify the Element based on tagName with id attribute value
     * syntax: <tagName>#<id attribute value>
     */
    private static void relativeCSSTagNameWithIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoPassword1");
    }

    /**
     * case 3: Identify the Element based on id attribute value
     * syntax: #<id attribute value>
     */
    private static void relativeCSSWithIdAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoPassword1");
    }

    /**
     * case 4: Identify the Element based on tagName with class attribute value
     * syntax: <tagName>.<id attribute value>
     */
    private static void relativeCSSTagNameWithClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoPassword1");
    }

    /**
     * case 5: Identify the Element based on class attribute value
     * syntax: .<id attribute value>
     */
    private static void relativeCSSWithClassAttributeValue()
    {
        oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoPassword2");
    }

    /**
     * case 6: Identify the Element based on tagName with attribute Name and value combination
     * syntax: <tagName>[attributeName='attributevalue']
     */
    private static void relativeCSSWithTagNameAndAttributeNameValueCombination()
    {
        oBrowser.findElement(By.cssSelector("input[name='submit1btn1']")).click();
    }

    /**
     * case 7: Identify the Element based on tagName with Multiple attribute Name and value combination
     * syntax: <tagName>[attributeName1='attributevalue'][attributeName2='attributevalue']
     */
    private static void relativeCSSWithTagNameAndMultipleAttributeNameValueCombination()
    {
        oBrowser.findElement(By.cssSelector("input[name='submit1btn1'][value='Submit']")).click();
    }

    /**
     * case 8: Identify the Element based on tagName with attribute Name
     * syntax: <tagName>[attributeName='attributevalue']
     */
    private static void relativeCSSWithTagNameAndAttributeName()
    {
        // Find count of Links in the Web Page
        List<WebElement> lists=oBrowser.findElements(By.cssSelector("a[href]"));
        System.out.println("# of Links are :"+lists.size());
    }

    private static void relativeCSSWithTagNameAndAttributeName_01()
    {
        // Display Link Names in the Web Page
        List<WebElement> lists=oBrowser.findElements(By.cssSelector("a[href]"));
       for(int i=0;i<lists.size();i++)
       {
           WebElement link=lists.get(i);
           String linkname=link.getText();
           System.out.println(linkname);
       }
    }

    private static void relativeCSSWithTagNameAndAttributeName_02()
    {
        // Display Link Names in the Web Page
        List<WebElement> lists=oBrowser.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<lists.size();i++)
        {
            WebElement link=lists.get(i);
            String linkname=link.getText();
            if(linkname.endsWith("Testing"))
            {
                link.click();
                break;
            }
        }
    }

    private static void relativeCSSWithTagNameAndAttributeName_03()
    {
        // StaleElementReferenceException: stale element reference: stale element not found
        List<WebElement> lists=oBrowser.findElements(By.cssSelector("a[href]"));
        for(int i=0;i<lists.size();i++)
        {
            WebElement link=lists.get(i);
            String linkname=link.getText();
            if(linkname.endsWith("Testing"))
            {
                link.click();
            }
        }
    }

    /**
     * case 9: Identify the Element based on tagName with attribute Name and value combination
     * syntax: <tagName>[attributeName ^= 'attributevalue']      starts-with
     * syntax: <tagName>[attributeName $= 'attributevalue']      ends-with
     * syntax: <tagName>[attributeName *= 'attributevalue']      contains
     */
    private static void relativeCSSWithPartialMatchingOfAttributeValue()
    {
     //   oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
        oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
    }


    /**
     * case 10: Identify the Element based on nth-child concept
     * syntax:   :nth-child(number)
     */
    private static void relativeCSSWithNthChildConcept()
    {
    //    oBrowser.findElement(By.cssSelector("form#frm3 > input")).sendKeys("DemoUser111");

        oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(4)")).sendKeys("DemoUser111");
    }

    /**
     * case 11: Identify the Element based on sibling appraoch
     * syntax:   :nth-child(number)
     */
    private static void relativeCSSWithSiblingConcept()
    {
       oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser111");
    }
}
