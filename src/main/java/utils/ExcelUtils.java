package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

    public static Object[][] getExcelData(
            String path,
            String sheetName)
            throws IOException {

        FileInputStream fis =
                new FileInputStream(path);

        Workbook workbook =
                WorkbookFactory.create(fis);

        Sheet sheet =
                workbook.getSheet(sheetName);

        int rows =
                sheet.getPhysicalNumberOfRows();

        int cols =
                sheet.getRow(0).getLastCellNum();

        Object[][] data =
                new Object[rows - 1][cols];

        for (int i = 1; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                data[i - 1][j] =
                        sheet.getRow(i)
                                .getCell(j)
                                .toString();
            }
        }

        workbook.close();

        return data;
    }
}