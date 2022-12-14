package com.orangehrmlive.testsuite;

import com.orangehrmlive.customlisteners.CustomListeners;
import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","Regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        loginPage.enterUsernameToUserNameField("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Dashboard";
        Thread.sleep(5000);
        String actualMessage = loginPage.getDashboardMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "correct text");
    }


}