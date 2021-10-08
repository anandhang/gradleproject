package test_scripts.common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtils {

    public static void getCurrentScreenShot(WebDriver driver) throws IOException {
       TakesScreenshot screenShot = (TakesScreenshot) driver;
       File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
       File destinationFile = new File(System.getProperty("user.dir") + "\\src\\screenshots\\" + dtf.format(LocalDateTime.now()) + ".png");
       FileHandler.copy(sourceFile, destinationFile);
    }

    public static void getScreenShot(WebDriver driver) throws IOException, AWTException {
        Robot robot = new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screenSize);
        BufferedImage scourceFile = robot.createScreenCapture(rectangle);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        File destinationFile = new File(System.getProperty("user.dir") + "\\src\\screenshots\\" + dtf.format(LocalDateTime.now()) + ".png");
        ImageIO.write(scourceFile,"png", destinationFile);
    }
}
