package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
    public ActiPage(WebDriver oBrowser)
    {
        PageFactory.initElements(oBrowser, this);
    }

    //userName text field
    private WebElement username;
    public WebElement getUsername()
    {
        return username;
    }
    //Password Text Field
    private WebElement pwd;
    public WebElement getPassword()
    {
        return pwd;
    }

    // Login button field
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement oLogin;
    public WebElement getLoginIn()
    {
        return oLogin;
    }
    //Flyout window Element
    private WebElement gettingStartedShortcutsPanelId;
    public WebElement getFlyOutWindow()
    {
        return gettingStartedShortcutsPanelId;
    }

    //Logout Link field
    @FindBy(linkText = "Logout")
    private WebElement oLogout;
    public WebElement getLogout()
    {
        return oLogout;
    }

}
