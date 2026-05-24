package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.DataProviders;

public class LoginTest extends BaseClass {

    @Test(
            dataProvider = "loginData",
            dataProviderClass = DataProviders.class
    )

    public void validLoginTest(
            String email,
            String password) {

        LoginPage lp =
                new LoginPage(driver);

        lp.clickMyAccount();

        lp.clickLogin();

        lp.enterEmail(email);

        lp.enterPassword(password);

        lp.clickLoginButton();

        String actualText =
                driver.findElement(
                        By.linkText(
                                "Edit your account information"))
                        .getText();

        Assert.assertEquals(
                actualText,
                "Edit your account information");

        System.out.println(
                "Login Successful");
    }
}