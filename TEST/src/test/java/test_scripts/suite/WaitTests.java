package test_scripts.suite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.elementsPage.ElementsPanel;
import pages.elementsPage.SubTabNames;
import pages.elementsPage.TabNames;
import pages.elementsPage.textBoxPage.TextBoxPage;
import pages.homePage.HomePage;
import test_scripts.common.CommonUtils;
import test_scripts.webdriverUtils.WebDriverUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WaitTests {
    private static final String URL = "https://demoqa.com/";
    @Test(enabled = false)
    public void usingSeleniumWaits(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/");
        new HomePage(driver).elementTab.click();
        new ElementsPanel(driver).selectTab(driver, TabNames.ELEMENT, SubTabNames.TEXT_BOX);
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.fullName.sendKeys("Anandhan");
        textBoxPage.email.sendKeys("anandhan@mail.com");
        textBoxPage.currentAddress.sendKeys("pudukkottai");
        textBoxPage.permanentAddress.sendKeys("Kulamangalam");
        textBoxPage.submitBtn.click();
        driver.quit();
    }
    @Test(enabled = false)
    public void getScreenShortTest() throws IOException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/");
        CommonUtils.getScreenShot(driver);
        driver.quit();
    }
    @Test(enabled = false)
    public void refreshTests() throws IOException, AWTException {
        WebDriver driver = WebDriverUtils.Open(URL);
        //driver.navigate().to(URL);
        //driver.get(driver.getCurrentUrl());
        new HomePage(driver).elementTab.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(("location.reload()"));
        Robot robot =new Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyRelease(KeyEvent.VK_F5);
        driver.quit();
    }
    @Test
    public void maximizeWindow() throws InterruptedException {
        WebDriver driver = WebDriverUtils.Open(URL);
        driver.manage().window().maximize();
        org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(300, 500);
        driver.manage().window().setSize(dimension);
        Thread.sleep(3000);
        driver.quit();
    }
}
