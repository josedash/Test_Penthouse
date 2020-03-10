package utils.test.cucumberReport;

import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import utils.test.selenium.SeleniumUtils;

import static org.openqa.selenium.OutputType.BYTES;

public class CucumberUtils {

    public static Scenario scenario;

    public static void addScreenshot(){
        TakesScreenshot camera = (TakesScreenshot) SeleniumUtils.WEB_DRIVER;
        byte[] screenshot = camera.getScreenshotAs(BYTES);
        scenario.embed(screenshot, "image/png", "testimage");
    }

    public static void writeMsg(String msg){
        scenario.write(msg);
    }


    public static void failTestWithScreenshot(String msg,boolean screenshot){
        if(screenshot){
            addScreenshot();
        }
    }
}
