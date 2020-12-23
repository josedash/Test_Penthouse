package app.bestbuyplayground.products;

import com.jayway.jsonpath.JsonPath;
import constants.ApplicationProperties;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

/**
 * Best buy has a great set of data and bigger jsons so we can utilize more extraction methods.
 */
public class ProductJsonPathData {


    String jsonResponse = "";

    @BeforeMethod
    void setUp() {
        //Set or Form Request
        RestAssured.baseURI = ApplicationProperties.BASE_URI_BESTBUY;
        RestAssured.port = 3030;
        RestAssured.basePath = ApplicationProperties.BASE_PATH_PRODUCTS;

        //Call API
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.log().all().get();

        //save json as resonse
        jsonResponse = response.asString();

        //
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    @AfterMethod
    void tearDown() {
        RestAssured.reset();
    }

    @Test
    void getProductsRootElement() {
        Map<String, ?> rootElement = JsonPath.read(jsonResponse, "$");
        System.out.println("Root Element \n" + rootElement.toString());
    }

    @Test
    void getProductTotalValueElement(){
        int total = JsonPath.read(jsonResponse, "$.total");
        System.out.println("Total Value : " + total);
    }

    @Test
    void getProductIds(){
        List<Integer> productIds = JsonPath.read(jsonResponse, "$.data[*].id");
        System.out.println(productIds.toString());
    }

    @Test
    void getProductAll(){
        List<Integer> productIds = JsonPath.read(jsonResponse, "$..[*].id");
        System.out.println(productIds.toString());
    }

    @Test
    void getProductsUnderPrice5(){
        List<String> productName = JsonPath.read(jsonResponse, "$.data[?(@.price<5)].name");
        System.out.println(productName.toString());
    }

}
