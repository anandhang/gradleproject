package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyManagement {
    @Test
    public void firstTestCase1(){
        System.out.println("1. first TestCase");
        Assert.assertEquals(1,1);
    }

    @Test(dependsOnMethods = "firstTestCase1")
    public void secondTestCase2(){
        System.out.println("2. second TestCase");
        Assert.assertEquals(2,2);
    }

    @Test(dependsOnMethods = "secondTestCase2")
    public void ThirdTestCase3(){
        System.out.println("3. Third TestCase");
        Assert.assertEquals(3,3);
    }

    @Test(dependsOnMethods = "ThirdTestCase3")
    public void fourthTestCase4(){
        System.out.println("4. fourth TestCase");
        Assert.assertEquals(4,4);
    }
}
