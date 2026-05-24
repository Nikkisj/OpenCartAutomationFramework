package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By firstProduct =
            By.xpath("(//div[@class='product-thumb'])[1]");

    By addToCartButton =
            By.xpath("(//span[text()='Add to Cart'])[1]");

    By addToWishListButton =
            By.xpath("(//button[@data-original-title='Add to Wish List'])[1]");

    By compareProductButton =
            By.xpath("(//button[@data-original-title='Compare this Product'])[1]");

    By productName =
            By.xpath("(//div[@class='caption']//a)[1]");

    // Actions

    public void clickFirstProduct() {

        driver.findElement(firstProduct).click();
    }

    public void clickAddToCart() {

        driver.findElement(addToCartButton).click();
    }

    public void clickWishList() {

        driver.findElement(addToWishListButton).click();
    }

    public void clickCompareProduct() {

        driver.findElement(compareProductButton).click();
    }

    public String getProductName() {

        return driver.findElement(productName).getText();
    }
}