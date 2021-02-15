package test_scripts.datadriven.using_parametes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
    @Parameters({"Username","Password"})
    public void TestCaseOne(String Username, String Password){
        System.out.println("FirstTest:"+Username);
        System.out.println("FirstTest:"+Password);
        System.out.println("--------------------------------");
    }
}
