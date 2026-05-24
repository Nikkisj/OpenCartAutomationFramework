package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "loginData")

    public Object[][] loginDataProvider()
            throws IOException {

        String path =
                System.getProperty("user.dir")
                        + "/src/test/resources/testdata/OpenCartData.xlsx";

        return ExcelUtils.getExcelData(
                path,
                "LoginData");
    }
}