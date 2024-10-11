package com.sgtesting.actitime.stepdefinitions;

import com.sgtesting.actitime.pom.ActiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.openqa.selenium.Alert;

public class StepDefinitions {

    public static WebDriver oBrowser=null;
    public static ActiPage oPage=null;
    public Logger log= LogManager.getLogger("BDD Automation");
    /**
     * Step Name: I launch chrome browser
     */
    @Given("^I launch chrome browser$")
    public void I_launch_chrome_browser()
    {
        try
        {
            log.info("The Execution of step I_launch_chrome_browser has started");
            oBrowser=new ChromeDriver();
            oPage=new ActiPage(oBrowser);
            Thread.sleep(4000);
            log.info("The Execution of step I_launch_chrome_browser has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_launch_chrome_browser :"+e);
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
            log.info("The Execution of step I_navigate_application_url has started");
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
            log.info("The Execution of step I_navigate_application_url has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_navigate_application_url :"+e);
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
            log.info("The Execution of step I_enter_username_in_username_text_field has started");
            oPage.getUsername().sendKeys("admin");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_username_in_username_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_username_in_username_text_field :"+e);
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
            log.info("The Execution of step I_enter_password_in_password_text_field has started");
            oPage.getPassword().sendKeys("manager");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_password_in_password_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_password_in_password_text_field :"+e);
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
            log.info("The Execution of step I_click_on_login_in_button has started");
            oPage.getLoginIn().click();
            Thread.sleep(5000);
            log.info("The Execution of step I_click_on_login_in_button has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_login_in_button :"+e);
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
            log.info("The Execution of step I_find_the_home_page has started");
            WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
            Assert.assertTrue(oEle.isDisplayed());
            log.info("The Execution of step I_find_the_home_page has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_find_the_home_page :"+e);
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
            log.info("The Execution of step I_minimize_flyout_window has started");
            oPage.getFlyOutWindow().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_minimize_flyout_window has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_minimize_flyout_window :"+e);
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
            log.info("The Execution of step I_click_on_logout_link has started");
            oPage.getLogout().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_logout_link has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_logout_link :"+e);
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
            log.info("The Execution of step I_find_the_login_page has started");
            String expected, actual;
            expected = "actiTIME - Login";
            actual=oBrowser.getTitle();
            Assert.assertEquals(actual, expected);
            Thread.sleep(2000);
            log.info("The Execution of step I_find_the_login_page has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_find_the_login_page :"+e);
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
            log.info("The Execution of step I_close_Application has started");
            oBrowser.quit();
            Thread.sleep(2000);
            log.info("The Execution of step I_close_Application has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_close_Application :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on User tab
     */
    @And("^I click on User tab$")
    public void I_click_on_User_tab()
    {
        try
        {
            log.info("The Execution of step I_click_on_User_tab has started");
            oPage.getUserTab().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_User_tab has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_User_tab :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on Add User Option
     */
    @And("^I click on Add User Option$")
    public void I_click_on_Add_User_Option()
    {
        try
        {
            log.info("The Execution of step I_click_on_Add_User_Option has started");
            oPage.getAddUser().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_Add_User_Option has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_Add_User_Option :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter FirstName in firstName text field
     */
    @And("^I enter FirstName in firstName text field$")
    public void I_enter_FirstName_in_firstName_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_FirstName_in_firstName_text_field has started");
            oPage.getFirstName().sendKeys("admin");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_FirstName_in_firstName_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_FirstName_in_firstName_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter LastName in lastName text field
     */
    @And("^I enter LastName in lastName text field$")
    public void I_enter_LastName_in_lastName_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_LastName_in_lastName_text_field has started");
            oPage.getLastName().sendKeys("User1");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_LastName_in_lastName_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_LastName_in_lastName_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter email in email text field
     */
    @And("^I enter email in email text field$")
    public void I_enter_email_in_email_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_email_in_email_text_field has started");
            oPage.getEmail().sendKeys("demo@gss.com");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_email_in_email_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_email_in_email_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter login user in loginusername text field
     */
    @And("^I enter login user in login username text field$")
    public void I_enter_loginuser_in_loginusername_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_loginuser_in_loginusername_text_field has started");
            oPage.getUserUserName().sendKeys("demoUser1");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_loginuser_in_loginusername_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_loginuser_in_loginusername_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter password in password text field
     */
    @And("^I enter user password in password text field$")
    public void I_enter_user_password_in_password_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_user_password_in_password_text_field has started");
            oPage.getUserPassword().sendKeys("Welcome123");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_user_password_in_password_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_user_password_in_password_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I enter retypepassword in password text field
     */
    @And("^I enter retypepassword in password text field$")
    public void I_enter_retypepassword_in_password_text_field()
    {
        try
        {
            log.info("The Execution of step I_enter_retypepassword_in_password_text_field has started");
            oPage.getPasswordCopy().sendKeys("Welcome123");
            Thread.sleep(2000);
            log.info("The Execution of step I_enter_retypepassword_in_password_text_field has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_enter_retypepassword_in_password_text_field :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on Create User button
     */
    @And("^I click on Create User button$")
    public void I_click_on_Create_User_button()
    {
        try
        {
            log.info("The Execution of step I_click_on_Create_User_button has started");
            oPage.getCreateUserButton().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_Create_User_button has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_Create_User_button :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I find the create User in the User List Page
     */
    @And("^I find the create User in the User List Page$")
    public void I_find_the_create_User_in_the_User_List_Page()
    {
        try
        {
            log.info("The Execution of step I_find_the_create_User_in_the_User_List_Page has started");
            WebElement oUser=oBrowser.findElement(By.xpath("//span[text()='User1, admin']"));
            Assert.assertTrue(oUser.isDisplayed());
            Thread.sleep(2000);
            log.info("The Execution of step I_find_the_create_User_in_the_User_List_Page has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_launch_chrome_browser :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on Username in the User List Page
     */
    @And("^I click on Username in the User List Page$")
    public void I_click_on_Username_in_the_User_List_Page()
    {
        try
        {
            log.info("The Execution of step I_click_on_Username_in_the_User_List_Page has started");
            oPage.getUserUSerList().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_Username_in_the_User_List_Page has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_Username_in_the_User_List_Page :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on delete button to delete the User
     */
    @And("^I click on delete button to delete the User$")
    public void I_click_on_delete_button_to_delete_the_User()
    {
        try
        {
            log.info("The Execution of step I_click_on_delete_button_to_delete_the_User has started");
            oPage.getDeleteButton().click();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_delete_button_to_delete_the_User has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_delete_button_to_delete_the_User :"+e);
            e.printStackTrace();
        }
    }

    /**
     * Step Name: I click on Ok button in the Alert to delete the User
     */
    @And("^I click on Ok button in the Alert to delete the User$")
    public void I_click_on_Ok_button_in_the_Alert_to_delete_the_User()
    {
        try
        {
            log.info("The Execution of step I_click_on_Ok_button_in_the_Alert_to_delete_the_User has started");
            Alert oAlert=oBrowser.switchTo().alert();
            String content=oAlert.getText();
            System.out.println(content);
            oAlert.accept();
            Thread.sleep(2000);
            log.info("The Execution of step I_click_on_Ok_button_in_the_Alert_to_delete_the_User has ended");
        }catch(Exception e)
        {
            log.error("There is an error occured during the execution of the Step I_click_on_Ok_button_in_the_Alert_to_delete_the_User :"+e);
            e.printStackTrace();
        }
    }
}
