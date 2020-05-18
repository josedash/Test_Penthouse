package stepdefs.components;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.junit.Test;
import utils.test.restapi.RestAssuredUtils;

public class WWeather {

    @Test
    public void testWWeather(){
        String url ="https://api.openweathermap.org/data/2.5/" +
                "weather?q=65030&units=metrics&appid=df0bf3aa83bb1fd6c43e1c6017cadbff";
        RestAssuredUtils restAssuredUtils = new RestAssuredUtils();
        RequestSpecification specification= restAssuredUtils.sendRestRequest("nothing", url, "");
        Response response = specification.get(url);
        System.out.println("System to ");
    }
}
