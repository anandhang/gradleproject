package test_scripts.suite.testngtestcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersSample implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test is going to start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test cases is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test cases is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test cases is onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test cases is onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test cases is onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test cases is onFinish");
    }
}
