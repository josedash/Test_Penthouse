package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTests {

    @Test
    @Parameters({"browser","url"})
    void setUp(String browser, String app){
        System.out.println("Browser Parameters : " + browser);
        System.out.println("App Url : " + app);
    }

    @Test
    void test(){
        System.out.println("Test");
    }
}
