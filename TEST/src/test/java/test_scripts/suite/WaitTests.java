package test_scripts.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.elementsPage.ElementsPanel;
import pages.elementsPage.SubTabNames;
import pages.elementsPage.TabNames;
import pages.elementsPage.textBoxPage.TextBoxPage;
import pages.homePage.HomePage;

import java.util.concurrent.TimeUnit;

public class WaitTests {

    @Test(groups = {"seleniumWaitTests"})
    public void usingSeleniumWaits(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/");
        new HomePage().elementTab.click();
        new ElementsPanel().selectTab(driver, TabNames.ELEMENT, SubTabNames.TEXT_BOX);
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fullName.sendKeys("Anandhan");
        textBoxPage.email.sendKeys("anandhan@mail.com");
        textBoxPage.currentAddress.sendKeys("pudukkottai");
        textBoxPage.permanentAddress.sendKeys("Kulamangalam");
    }
}
