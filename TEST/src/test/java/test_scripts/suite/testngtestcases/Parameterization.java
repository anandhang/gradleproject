package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    @Test
    @Parameters({"Username","Password"})
    public void apple1(String Username, String Password){
        System.out.println("Name is : "+Username);
        System.out.println("Password is : "+Password);
        Assert.assertEquals(1,1);
    }
}
