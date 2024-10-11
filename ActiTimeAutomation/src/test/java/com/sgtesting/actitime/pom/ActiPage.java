package com.sgtesting.actitime.pom;

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

    //User Tab
    @FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
    private WebElement oUserTab;

    public WebElement getUserTab(){
        return oUserTab;
    }

    //Add User button
    @FindBy(xpath = "//div[text()='Add User']")
    public WebElement oAddUser;
    public WebElement getAddUser()
    {
        return oAddUser;
    }

    // User Page First Name text field
    private WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    // User Page Last Name text field
    private WebElement lastName;
    public WebElement getLastName(){
        return lastName;
    }

    // User Page Last Name text field
    private WebElement email;
    public WebElement getEmail(){
        return email;
    }

    //User Page userName field
    private WebElement userDataLightBox_usernameField;
    public WebElement getUserUserName(){
        return userDataLightBox_usernameField;
    }

    // User Page Password text field
    private WebElement password;
    public WebElement getUserPassword(){
        return password;
    }

    // User Page retype Password text field
    private WebElement passwordCopy;
    public WebElement getPasswordCopy(){
        return passwordCopy;
    }

    // User Page CreateUser section.
    @FindBy(xpath = "//span[text()='Create User']")
    private WebElement oCreateUserBtn;
    public WebElement getCreateUserButton()
    {
        return oCreateUserBtn;
    }

    // User in the User List Page
    @FindBy(xpath = "//span[text()='User1, admin']")
    private WebElement oUserUserList;
    public WebElement getUserUSerList()
    {
        return oUserUserList;
    }

    // Delete Button for User
    private WebElement userDataLightBox_deleteBtn;
    public WebElement getDeleteButton()
    {
        return userDataLightBox_deleteBtn;
    }
    //Save Chnages Button
    @FindBy(xpath="//span[text()='Save Changes']")
    private WebElement oSaveChangesButton;
    public WebElement getSaveChnages()
    {
        return oSaveChangesButton;
    }
}
