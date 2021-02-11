package pages.elementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPanel {

    public ElementsPanel(WebDriver driver){
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header-text' and text()='Elements']")));
    }

    public void selectTab(WebDriver driver, TabNames tabName, SubTabNames selectItemName){
        String headerText = "//div[@class='header-text' and text()='Elements']";
        String textBoxXpath = "//div[@class='element-list collapse show']//span[text()='Text Box']";
        List<WebElement> textBoxEle = driver.findElements(By.xpath(textBoxXpath));
        if (textBoxEle.size() > 0){
            textBoxEle.get(0).click();
        }else {
            new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath(headerText)));
            driver.findElement(By.xpath(headerText)).click();
        }
    }
}
