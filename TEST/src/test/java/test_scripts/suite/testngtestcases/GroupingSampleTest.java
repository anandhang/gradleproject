package test_scripts.suite.testngtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingSampleTest {

    @Test(groups = {"apple"})
    public void apple1(){
        System.out.println("1. apple1");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"apple"})
    public void apple2(){
        System.out.println("2. apple1");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"apple"})
    public void apple3(){
        System.out.println("3. apple3");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"oppo"})
    public void oppo1(){
        System.out.println("1. oppo1");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"oppo"})
    public void oppo2(){
        System.out.println("2. oppo2");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"vivo"})
    public void vivo1(){
        System.out.println("1. vivo1");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"vivo"})
    public void vivo2(){
        System.out.println("2. vivo2");
        Assert.assertEquals(1,1);
    }
}
