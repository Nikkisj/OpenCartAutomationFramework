package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SearchPage;

public class SearchTest extends BaseClass {

    @Test
    public void searchProductTest() {

        SearchPage sp =
                new SearchPage(driver);

        sp.enterProduct("iPhone");

        sp.clickSearch();

        String title =
                driver.getTitle();

        Assert.assertTrue(
                title.contains("Search"));
    }
}