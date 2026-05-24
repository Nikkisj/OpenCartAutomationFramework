package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By myAccount =
            By.xpath("//span[text()='My Account']");

    By loginLink =
            By.linkText("Login");

    By registerLink =
            By.linkText("Register");

    By searchBox =
            By.name("search");

    By searchButton =
            By.xpath("//button[@class='btn btn-default btn-lg']");

    By cartButton =
            By.id("cart-total");

    // Actions

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickLogin() {

        driver.findElement(loginLink).click();
    }

    public void clickRegister() {

        driver.findElement(registerLink).click();
    }

    public void searchProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public void clickCart() {

        driver.findElement(cartButton).click();
    }
}