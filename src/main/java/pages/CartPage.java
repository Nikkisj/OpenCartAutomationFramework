package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By addToCartBtn =
            By.xpath("(//span[text()='Add to Cart'])[1]");

    By cartBtn =
            By.id("cart-total");

    // Actions

    public void clickAddToCart() {

        driver.findElement(addToCartBtn).click();
    }

    public void clickCart() {

        driver.findElement(cartBtn).click();
    }
}