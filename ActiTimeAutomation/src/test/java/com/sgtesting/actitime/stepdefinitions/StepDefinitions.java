package com.sgtesting.actitime.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class StepDefinitions {
    public static WebDriver oBrowser=null;
    /**
     * Step Name: I launch chrome browser
     */
    @Given("^I launch chrome browser$")
    public void I_launch_chrome_browser()
    {
        try
        {
            oBrowser=new ChromeDriver();
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I navigate application url
     */
    @And("^I navigate application url$")
    public void I_navigate_application_url()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter username in username text field
     */
    @When("^I enter username in username text field$")
    public void I_enter_username_in_username_text_field()
    {
        try
        {
            oBrowser.findElement(By.id("username")).sendKeys("admin");
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter password in password text field
     */
    @And("^I enter password in password text field$")
    public void I_enter_password_in_password_text_field()
    {
        try
        {
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on login in button
     */
    @And("^I click on login in button$")
    public void I_click_on_login_in_button()
    {
        try
        {
            oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
            Thread.sleep(5000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I find the home page
     */
    @Then("^I find the home page$")
    public void I_find_the_home_page()
    {
        try
        {
            WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
            Assert.assertTrue(oEle.isDisplayed());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I minimize flyout window
     */
    @And("^I minimize flyout window$")
    public void I_minimize_flyout_window()
    {
        try
        {
            oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on logout link
     */
    @When("^I click on logout link$")
    public void I_click_on_logout_link()
    {
        try
        {
            oBrowser.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I find the login page
     */
    @Then("^I find the login page$")
    public void I_find_the_login_page()
    {
        try
        {
            String expected, actual;
            expected = "actiTIME - Login";
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I close Application
     */
    @And("^I close Application$")
    public void I_close_Application()
    {
        try
        {
            oBrowser.quit();
            Thread.sleep(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
