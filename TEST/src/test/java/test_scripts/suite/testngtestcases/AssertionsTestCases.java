package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTestCases {
    @Test(enabled = false)
    public void firstTestCases01a(){
        String a = "a";
        String b = "a";
        Assert.assertEquals(a,b,"TEST Passedd");
    }

    @Test
    public void firstTestCases01b(){
        SoftAssert softAssertion= new SoftAssert();
        System.out.println("softAssert Method Was Started");
        softAssertion.assertTrue(false,"Failed");
        System.out.println("softAssert Method Was Executed");
    }

}
