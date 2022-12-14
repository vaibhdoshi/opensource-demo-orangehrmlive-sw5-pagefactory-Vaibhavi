package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.ForgotPasswordPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();
    }


    @Test(groups = {"sanity", "Regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPassword();
        String expectedMessage="Reset Password";
        String actualMessage =forgotPasswordPage.forgotPasswordText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is not correct");

    }
}
