package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;

public class CartTest extends BaseClass {

    @Test
    public void addProductToCartTest() {

        CartPage cp =
                new CartPage(driver);

        cp.clickAddToCart();

        cp.clickCart();

        String cartText =
                driver.getPageSource();

        Assert.assertTrue(
                cartText.contains("Shopping Cart"));
    }
}