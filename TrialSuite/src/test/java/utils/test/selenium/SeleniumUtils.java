package utils.test.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumUtils {


    public static WebDriver webDriver = DriverFactory.getChromeDriver();

    public static void takeScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)webDriver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
    }


}
