package app;

import constants.ApplicationProperties;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {

    @BeforeTest
    public static void init(){
        RestAssured.baseURI = ApplicationProperties.BASE_URI_TYPEPLACEHOLDER;
    }
}
