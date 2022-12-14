package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[text()=' Login ']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/span[1]/h6[1]")
    WebElement dashboard;

    /*By userName = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.name("password");
    By loginButton=By.xpath("//button[text()=' Login ']");
    By dashboard=By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");*/


    public void enterUsernameToUserNameField(String username) {
        Reporter.log("Enter username " + username + " to username field " + userName.toString());
        sendTextToElement(userName, username);
    }
    public void enterPassword(String password) {
        Reporter.log("Enter password" + password + "to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);

    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getDashboardMessage() {
        Reporter.log("get dashboard message" + dashboard.toString());
        return getTextFromElement(dashboard);

    }


}
