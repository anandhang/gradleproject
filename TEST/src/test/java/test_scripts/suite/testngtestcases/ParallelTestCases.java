package test_scripts.suite.testngtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParallelTestCases {

    @Test
    public void openChromeOne() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/");
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void openChromeTwo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://google.com/");
        Thread.sleep(5000);
        driver.quit();
    }
}
