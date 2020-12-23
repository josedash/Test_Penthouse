package app.bestbuyplayground.stores;

import constants.ApplicationProperties;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

/**
 *  * Best buy has a great set of data and bigger jsons so we can utilize more extraction methods. JsonSlurper use groovy
 * https://www.tutorialspoint.com/execute_groovy_online.php
 *
 * // Groovy library links
 * http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/Collection.html#findAll()
 * http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/Collection.html#find()
 *
 *  JSON Viewer/Formatter:
 * http://jsonviewer.stack.hu/
 *
 */
public class StoresJsonSlurper {

    String jsonResponse = "";
    ValidatableResponse validatableResponse = null;



    @Test
    void getStoresTotalValue(){
        int total = validatableResponse.extract().path("total");
        System.out.println("Total Value : " + total);
    }

    @Test
    void getStoreFirstDataElement(){
        String name = validatableResponse.extract().path("data[0].name");
        System.out.println("Name : " + name);
    }

    @Test
    void getStoreInfoOfAStoreWithZipCode(){
        Map<String, ?> stores = validatableResponse.extract().path("data.find{it.zip=='55901'}");
        System.out.println("Store with zipcode : " + stores.toString());

        String address = validatableResponse.extract().path("data.find{it.zip=='55901'}.address");
        System.out.println("Store with zipcode 55901 address : " + address);
    }

    @Test
    void getStoresIdMaxAndMin(){
        Map<String, ?> storeMax = validatableResponse.extract().path("data.max{it.id}");
        System.out.println("Store max : " + storeMax.toString());

        Map<String, ?> storeMin = validatableResponse.extract().path("data.min{it.id}");
        System.out.println("Store min : " + storeMin);
    }

    @Test
    void getStoreWithIdLessThan10(){
        List<String> zipCodes = validatableResponse.extract().path("data.findAll{it.id<10}.zip");
        zipCodes.stream().forEach(zip -> System.out.println(zip));
    }

    @Test
    void getAllStoreServicesNamesForAllStores(){
        List<List<String>> serviceNames = validatableResponse.extract().path("data.services.findAll{it.name}.name");
        serviceNames.stream().forEach(serviceName -> System.out.println(serviceName));
    }


    @BeforeMethod
    void setUp() {
        //Set or Form Request
        RestAssured.baseURI = ApplicationProperties.BASE_URI_BESTBUY;
        RestAssured.port = 3030;
        RestAssured.basePath = ApplicationProperties.BASE_PATH_STORE;

        //Call API
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.log().all().get();

        //save json as resonse
        jsonResponse = response.asString();

        //
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    @AfterMethod
    void tearDown() {
        RestAssured.reset();
    }



}
