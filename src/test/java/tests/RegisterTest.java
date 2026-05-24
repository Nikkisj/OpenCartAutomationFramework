package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.RegisterPage;

public class RegisterTest extends BaseClass {

    @Test
    public void registerUserTest() {

        RegisterPage rp =
                new RegisterPage(driver);

        rp.clickMyAccount();

        rp.clickRegister();

        rp.enterFirstName("Nikita");

        rp.enterLastName("Jadhav");

        rp.enterEmail(
                "nikita"
                        + System.currentTimeMillis()
                        + "@gmail.com");

        rp.enterTelephone("9876543210");

        rp.enterPassword("Test@123");

        rp.enterConfirmPassword("Test@123");

        rp.clickPrivacyPolicy();

        rp.clickContinue();

        String title =
                driver.getTitle();

        Assert.assertTrue(
                title.contains("Your Account"));
    }
}