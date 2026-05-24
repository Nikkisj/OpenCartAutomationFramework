package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseClass {

    @Test
    public void logoutTest() {

        LoginPage lp =
                new LoginPage(driver);

        lp.clickMyAccount();

        lp.clickLogin();

        lp.enterEmail("testuser@gmail.com");

        lp.enterPassword("Test@123");

        lp.clickLoginButton();

        LogoutPage logout =
                new LogoutPage(driver);

        logout.clickMyAccount();

        logout.clickLogout();

        String title =
                driver.getTitle();

        Assert.assertTrue(
                title.contains("Account Logout"));
    }
}