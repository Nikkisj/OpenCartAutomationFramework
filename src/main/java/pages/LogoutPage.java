package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By myAccount =
            By.xpath("//span[text()='My Account']");

    By logoutLink =
            By.linkText("Logout");

    // Actions

    public void clickMyAccount() {

        driver.findElement(myAccount).click();
    }

    public void clickLogout() {

        driver.findElement(logoutLink).click();
    }
}