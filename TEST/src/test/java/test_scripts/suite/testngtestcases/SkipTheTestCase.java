package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTheTestCase {

    @Test(priority = 0)
    public void firstTestCaseeq(){
        System.out.println("1. SkipTheTestCase 1");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 1)
    public void secondTestCaserqq(){
        System.out.println("2. SkipTheTestCase 2");
        Assert.assertEquals(2,2);
    }

    @Test(priority = 3)
    public void ThirdTestCasetqqq(){
        System.out.println("3. SkipTheTestCase 3");
        Assert.assertEquals(3,3);
    }

    @Test(enabled = false)
    public void fourthTestCaseyqqq(){
        System.out.println("4. SkipTheTestCase 4");
        Assert.assertEquals(4,4);
    }
}
