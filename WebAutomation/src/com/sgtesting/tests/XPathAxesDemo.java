package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    public static WebDriver oBrowser=null;
    public static void main(String[] args) {
        launchBrowser();
        navigateURL();
   //     personNameSachinTendulkarEnterSalary();
    //    enterSalaryForPersonWhoIsNextToSachinTendulkar();
   //     selectStatusCheckBoxForIndianFreeDomFighterDesignation();
   //     selectStatusCheckBoxForRecordWhichIsPreviousToRahulDravid();
   //     enterTheSalaryFor4thRecordBasedOnDescendant();
        basedOnLastSalaryTextFieldDisplayTableIdAttributeValue();
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

    /**
     *  following-sibling
     * case 1: for PersonName Sachin Tendulkar, enter Salary 25000
     */
    private static void personNameSachinTendulkarEnterSalary()
    {
     //   oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("25000");
        oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
    }

    /**
     *  following
     * case 2: Enter Salary for the Person Who is Next to Sachin Tendulkar
     */
    private static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
    {
       oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("25000");
    }

    /**
     *  preceding-sibling
     * case 3: Select Status check Box for Designation Indian Freedom Fighter
     */
    private static void selectStatusCheckBoxForIndianFreeDomFighterDesignation()
    {
      oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
    }

    /**
     *  preceding
     * case 4: Select Status check Box for a Person Who is Previous To Rahul Dravid
     */
    private static void selectStatusCheckBoxForRecordWhichIsPreviousToRahulDravid()
    {
        oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
    }

    /**
     *  Descendant
     * case 4: Enter the Salary for the 4th Record based on Descendant
     */
    private static void enterTheSalaryFor4thRecordBasedOnDescendant()
    {
        oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("34000");
    }

    /**
     *  Ancestor
     * case 4: Based on Last Salary Text field display the table id attribute value
     */
    private static void basedOnLastSalaryTextFieldDisplayTableIdAttributeValue()
    {
        WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit5']/ancestor::td/ancestor::tr/ancestor::table"));
        String v1=oEle.getAttribute("id");
        System.out.println(v1);
    }
}
