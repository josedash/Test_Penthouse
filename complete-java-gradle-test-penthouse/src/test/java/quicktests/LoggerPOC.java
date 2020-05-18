package quicktests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

public class LoggerPOC {

    private static Logger LOGGER = LogManager.getLogger(LoggerPOC.class);

    @Test
    public void LoggerTest() throws InterruptedException, IOException {
        String name = "Jose Mtz Morales.";
        LOGGER.trace("trace msg.");
        LOGGER.info("Chrome Browser has been fetched.");
        LOGGER.debug("debugging variables.");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        LOGGER.warn("Chrome Browser has been fetched.");
    }


}
