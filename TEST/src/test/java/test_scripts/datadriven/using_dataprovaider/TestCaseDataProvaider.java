package test_scripts.datadriven.using_dataprovaider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseDataProvaider {

    String[][] data={
        {"Anandhan","Sandhanam"},
        {"Subhashree","21031993"},
        {"Riyana","09122020"}
    };

    @DataProvider(name="DataProvaiderTestcases")
    public String[][] TestCaseDataProvaider(){
        return data;
    }

    @Test(dataProvider="DataProvaiderTestcases")
    public void TestCaseOne(String Username, String Password){
        System.out.println("FirstTest:"+Username);
        System.out.println("FirstTest:"+Password);
        System.out.println("--------------------------------");
    }
}
