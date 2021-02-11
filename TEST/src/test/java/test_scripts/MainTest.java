package test_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.elementsPage.ElementsPanel;
import pages.elementsPage.SubTabNames;
import pages.elementsPage.TabNames;
import pages.elementsPage.textBoxPage.TextBoxPage;
import pages.homePage.HomePage;
import java.util.concurrent.TimeUnit;

public class MainTest {
    public static void main(String[] arg) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().to("https://demoqa.com/");
            driver.manage().window().maximize();
            new HomePage(driver).elementTab.click();
            new ElementsPanel(driver).selectTab(driver, TabNames.ELEMENT, SubTabNames.TEXT_BOX);
            TextBoxPage textBoxPage = new TextBoxPage(driver);
            textBoxPage.fullName.sendKeys("Anandhan");
            textBoxPage.email.sendKeys("anandhan@mail.com");
            textBoxPage.currentAddress.sendKeys("pudukkottai");
            textBoxPage.permanentAddress.sendKeys("Kulamangalam");
    }
}
