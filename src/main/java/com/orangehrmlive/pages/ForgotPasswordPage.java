package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    public void ForgotPassword() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-forgot']//p")
    WebElement forgotPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-forgot-password-container']//h6")
    WebElement forgotPasswordText;
    public void clickOnForgotPassword() {
        Reporter.log("Click on forgot password button" + forgotPassword.toString());
        clickOnElement(forgotPassword);
    }
    public String forgotPasswordText() {
        Reporter.log("get password message " + forgotPasswordText.toString());
        return getTextFromElement(forgotPasswordText);
    }


}