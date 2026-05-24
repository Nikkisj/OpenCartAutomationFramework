package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    By searchBox =
            By.name("search");

    By searchBtn =
            By.xpath("//button[@class='btn btn-default btn-lg']");

    // Actions

    public void enterProduct(String product) {

        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearch() {

        driver.findElement(searchBtn).click();
    }
}