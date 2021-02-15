package test_scripts.datadriven.using_parametes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase2 {
    @Test
    @Parameters({"Username","Password"})
    public void TestCaseSecond(String Username, String Password){
        System.out.println("SecondTest:"+Username);
        System.out.println("SecondTest:"+Password);
        System.out.println("--------------------------------");
    }
}
