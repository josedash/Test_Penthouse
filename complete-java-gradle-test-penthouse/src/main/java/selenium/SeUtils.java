package selenium;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeUtils {

    public static void navigateTo(String url) {
        Selenium.getWebDriver().navigate().to(url);
    }

    private static Logger LOGGER = LogManager.getLogger(SeUtils.class);

    // Javascript Methods.

    // Dropdown Methods.

    // Handling Cookies.

    // Actions & Robot.

    // Screenshots.
    public static byte[] takeScreenshot() {
        return  ((TakesScreenshot) Selenium.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }


    // Alert Methods.
    public static void alertConfirm() {
        Alert alert = Selenium.getWait().until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public static void alertDismiss() {
        Alert alert = Selenium.getWait().until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
    }

    public static void alertSendkeys(String keys) {
        Alert alert = Selenium.getWait().until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(keys);
    }

}
