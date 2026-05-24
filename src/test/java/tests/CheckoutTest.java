package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CheckoutPage;

public class CheckoutTest extends BaseClass {

    @Test
    public void checkoutTest() {

        CheckoutPage cp =
                new CheckoutPage(driver);

        cp.clickCheckout();

        String title =
                driver.getTitle();

        Assert.assertTrue(
                title.contains("Checkout"));
    }
}