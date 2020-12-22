package app.jsonplaceholder.posts;

import app.TestBase;
import com.jayway.jsonpath.JsonPath;
import constants.ApplicationProperties;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class PostsExtractData extends TestBase {

    //Json Array
    @Test
    void getPostsWithGlobalSetBaseURI() {
        RequestSpecification reqSpec = RestAssured.given();
        reqSpec.basePath(ApplicationProperties.BASEPATH_POST);
        Response response = reqSpec.get();
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);

        String jsonResponse = response.asString();

        List<?> rootElement = JsonPath.read(jsonResponse, "$");
        System.out.println(rootElement.toString());

        System.out.println("----------------------Titles -----------------");
        List<?> tittle = JsonPath.read(jsonResponse, "$[*].title");
        System.out.println(rootElement.toString());

    }
}
