package test_scripts.datadriven.using_dataprovaider;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataDriverUsingPOI {
    public void readData() throws FileNotFoundException {
        FileInputStream excel = new FileInputStream(System.getProperty("user.dir")+"\\src\\testdata\\TestDataFile.xlsx");
       // Workbook workbook = new XSSFWorkbook(excel);

    }
}
