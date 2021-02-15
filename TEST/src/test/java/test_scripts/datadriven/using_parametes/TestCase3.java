package test_scripts.datadriven.using_parametes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    @Parameters({"Username","Password"})
    public void TestCaseThird(String Username, String Password){
        System.out.println("ThirdTest:"+Username);
        System.out.println("ThirdTest:"+Password);
        System.out.println("--------------------------------");
    }
}
