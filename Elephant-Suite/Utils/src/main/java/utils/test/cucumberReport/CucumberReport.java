package utils.test.cucumberReport;



import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import utils.test.selenium.Selenium;

import static org.openqa.selenium.OutputType.BYTES;

public class CucumberReport {

    public static Scenario scenario;

    public static void addScreenshot(){
        TakesScreenshot camera = (TakesScreenshot) Selenium.WEB_DRIVER;
        byte[] screenshot = camera.getScreenshotAs(BYTES);
        scenario.attach(screenshot, "image/png","");
    }

    public static void writeMsg(String msg){
        scenario.log(msg);
    }

    public static void failTestWithScreenshot(String msg, boolean screenshot){
        if(screenshot){
            addScreenshot();
        }
    }
}
