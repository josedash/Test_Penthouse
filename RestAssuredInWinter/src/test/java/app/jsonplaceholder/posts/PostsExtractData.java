package app.posts;

import constants.ApplicationProperties;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostsExtractData {

    @Test
    void getPostsWithGlobalSetBaseURI() {
        RequestSpecification reqSpec = RestAssured.given();
        reqSpec.basePath(ApplicationProperties.BASEPATH_POST);

        Response response = reqSpec.get();
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        RestAssured.reset();
    }
}
