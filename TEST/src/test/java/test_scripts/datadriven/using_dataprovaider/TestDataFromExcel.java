package test_scripts.datadriven.using_dataprovaider;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestDataFromExcel {

    String[][] data=null;

    @DataProvider(name="testData")
    public Object[][] TestCaseTestData() throws IOException, BiffException {
        data=getExcelData();
        return data;
    }

    public String[][] getExcelData() throws IOException, BiffException {
        FileInputStream excel = new FileInputStream(System.getProperty("user.dir")+"\\src\\testdata\\TestDateFile.xls");
        Workbook workbook = Workbook.getWorkbook(excel);
        Sheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getRows();
        int columnCount = sheet.getColumns();
        String testData[][] = new String[rowCount-1][columnCount];
        for(int row = 1; row < rowCount; row++){
            for(int col = 0; col < columnCount; col++){
                testData[row-1][col] = sheet.getCell(col, row).getContents();
            }
        }
        return testData;
    }

    @Test(dataProvider = "testData")
    public void TestCase(String Username, String Password) {
        System.out.println("FirstTest:" + Username);
        System.out.println("FirstTest:" + Password);
        System.out.println("--------------------------------");
    }
}
