package utils.driverfactory;

import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class ChromeDriverManager extends DriverManager {


    private ChromeDriverService chService;

    public void startService() {
        if (null == chService) {
            try {
                chService = new ChromeDriverService.Builder()
                        .usingChromeDriverExecutable(new File("chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    public void createDriver() {

    }


}
