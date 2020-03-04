package utils.test.selenium.driverfactory;

import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeDriverManager extends DriverManager {


    private ChromeDriverService chService;

    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    public void createDriver() {

    }


}
