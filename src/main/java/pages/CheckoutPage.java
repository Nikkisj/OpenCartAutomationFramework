package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By checkoutBtn =
            By.linkText("Checkout");

    // Actions

    public void clickCheckout() {

        driver.findElement(checkoutBtn).click();
    }
}