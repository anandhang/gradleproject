package test_scripts.webdriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils {
    public static WebDriver Open(String URL){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        return driver;
    }
}
