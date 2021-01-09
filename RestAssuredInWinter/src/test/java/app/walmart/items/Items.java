package app.walmart.items;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Items {

//   ?apiKey={apiKey}&publisherId={Your Impact Radius Publisher Id}&format=json

    @Test
    void getItems(){

        RequestSpecification reqSpec = RestAssured.given();
        reqSpec.log().all()
                .queryParam("apiKey","75e3u4sgb2khg673cbv2gjup")
                .get(" http://api.walmartlabs.com/v1/items?ids=12417832").
            then().log().all();
    }


}
