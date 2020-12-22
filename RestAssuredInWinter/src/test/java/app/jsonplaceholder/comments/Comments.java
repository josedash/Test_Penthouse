package app.comments;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Comments {

    //adding query parameters
    @Test
    void getCommentsByPostId(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.queryParam("postId","1");

        Response response = requestSpecification.get("https://jsonplaceholder.typicode.com/comments");
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();

        validatableResponse.statusCode(200);
    }


    @Test(testName = "Get Comment By Post Id")
    void getCommentsByPostIdParameterAsMap(){

        RequestSpecification requestSpecification = RestAssured.given();
        Map<String, Object> params = new HashMap<String,Object>();
        params.put("postId", "1");
        requestSpecification.queryParams(params);

        Response response = requestSpecification.get("https://jsonplaceholder.typicode.com/comments");
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();

        validatableResponse.statusCode(200);
    }


}
