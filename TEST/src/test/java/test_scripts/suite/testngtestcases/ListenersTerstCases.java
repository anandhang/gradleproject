package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersTerstCases {
    @Test(priority = 5)
    public void firstTestCases01(){
        System.out.println("1. PriorityAndOrder 1");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 6)
    public void secondTestCases(){
        System.out.println("2. PriorityAndOrder 2");
        Assert.assertEquals(2,3);
    }

    @Test(priority = 7,enabled = false)
    public void ThirdTestCased(){
        System.out.println("3. PriorityAndOrder 3");
        Assert.assertEquals(3,3);
    }

    @Test(priority = 8)
    public void fourthTestCasef(){
        System.out.println("4. PriorityAndOrder 4");
        Assert.assertEquals(4,4);
    }
}
