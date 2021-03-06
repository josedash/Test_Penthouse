package utils.test.cucumberReport;

import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import utils.test.selenium.Selenium;

import static org.openqa.selenium.OutputType.BYTES;

public class CucumberReport {

    public static Scenario scenario;

    public static void addScreenshot(){
        TakesScreenshot camera = (TakesScreenshot) Selenium.WEB_DRIVER;
        byte[] screenshot = camera.getScreenshotAs(BYTES);
        scenario.embed(screenshot, "image/png");
    }

    public static void writeMsg(String msg){
        scenario.write(msg);
    }

    public static void failTestWithScreenshot(String msg, boolean screenshot){
        if(screenshot){
            addScreenshot();
        }
        Assert.assertTrue(msg,false);
    }
}
