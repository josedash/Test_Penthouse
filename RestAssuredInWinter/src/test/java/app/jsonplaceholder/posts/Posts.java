package app.jsonplaceholder.posts;


import app.TestBase;
import com.github.javafaker.Faker;
import com.jayway.jsonpath.JsonPath;
import constants.ApplicationProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import model.Post;
import org.testng.annotations.Test;

import java.util.List;

public class Posts extends TestBase {


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

    @Test
    void getPosts() {
        RequestSpecification reqSpec = RestAssured.given();

        Response response = reqSpec.get("https://jsonplaceholder.typicode.com/posts");
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    @Test
    void getPostByIdPathParam() {
        RequestSpecification reqSpec = RestAssured.given();
        reqSpec.pathParam("id", "1");

        Response response = reqSpec.get("https://jsonplaceholder.typicode.com/posts/{id}");
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    @Test
    void createPostWithJsonAsString() {
        String payload = "{\n" +
                "   \"title\":\"How to be cool in life? \",\n" +
                "   \"body\":\"Just be yourself\",\n" +
                "   \"userId\":1\n" +
                "}";

        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .body(payload)
                .post()
                .then().statusCode(201)
                .extract().response();

        response.prettyPrint();
    }

    //rest assured uses any of these serializers (jackson, gson, johnzon, yasson
    @Test
    void createPostWithPojo() {
        Faker faker = new Faker();

        Post createPost = new Post();
        createPost.setTitle(faker.harryPotter().character() + " Best Quote" );
        createPost.setBody("--" + faker.harryPotter().quote());
        createPost.setUserId(1);

        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .body(createPost)
                .post()
                .then().statusCode(201)
                .extract().response();

        response.prettyPrint();
    }

    @Test
    void updatePutPathParam(){
        Faker faker = new Faker();

        Post updatePost = new Post();
        updatePost.setId(1);
        updatePost.setTitle(faker.harryPotter().character() + " Best Quote" );
        updatePost.setBody("--" + faker.harryPotter().quote());
        updatePost.setUserId(1);

        Response response = RestAssured.given()
                .log().headers()
                .log().body()
                .log().params()
                .pathParam("id", 1)
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST + "/{id}")
                .when()
                .contentType(ContentType.JSON)
                .body(updatePost)
                .put()
                .then()
                .log().headers()
                .log().body()
                .statusCode(200)
                .extract().response();

        response.prettyPrint();

    }

    @Test
    void updatePutLogAll(){
        Faker faker = new Faker();

        Post updatePost = new Post();
        updatePost.setId(1);
        updatePost.setTitle(faker.harryPotter().character() + " Best Quote" );
        updatePost.setBody("--" + faker.harryPotter().quote());
        updatePost.setUserId(1);

        Response response = RestAssured.given()
                .log().all()
                .pathParam("id", 1)
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST + "/{id}")
                .when()
                .contentType(ContentType.JSON)
                .body(updatePost)
                .put()
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .extract().response();
    }


    @Test
    void updatePutPathParamStraightValue(){
        Faker faker = new Faker();

        Post updatePost = new Post();
        updatePost.setId(1);
        updatePost.setTitle(faker.harryPotter().character() + " Best Quote" );
        updatePost.setBody("--" + faker.harryPotter().quote());
        updatePost.setUserId(1);

        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .body(updatePost)
                .put("/1")
                .then().statusCode(200)
                .extract().response();

        response.prettyPrint();
    }

    @Test
    void updatePartialInfoPatch(){
        Faker faker = new Faker();

        Post updatePost = new Post();
        updatePost.setId(1);
        updatePost.setTitle(faker.harryPotter().character() + " Best Quote" );

        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .body(updatePost)
                .patch("/1")
                .then().statusCode(200)
                .extract().response();

        response.prettyPrint();
    }

    @Test
    void deletePost(){
        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .delete("/1")
                .then().statusCode(200)
                .extract().response();
    }

    @Test
    void deletePostUserNotFound(){
        Response response = RestAssured.given()
                .baseUri(ApplicationProperties.BASE_URI_TYPEPLACEHOLDER)
                .basePath(ApplicationProperties.BASEPATH_POST)
                .when()
                .contentType(ContentType.JSON)
                .delete("/1")
                .then().statusCode(200)
                .extract().response();
    }

    @Test
    void getPostsLogInfo() {
        RequestSpecification reqSpec = RestAssured.given().log().headers().log().body();

        Response response = reqSpec.get("https://jsonplaceholder.typicode.com/posts");
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }

    //Json Array
    @Test
    void getPostTitles() {
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
