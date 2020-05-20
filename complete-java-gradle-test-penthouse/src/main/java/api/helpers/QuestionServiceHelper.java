package api.helpers;

import api.constants.Endpoints;
import api.model.Question;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import webservices.rest.RestAssuredBase;

public class QuestionServiceHelper extends RestAssuredBase {

    private static Logger LOGGER = LogManager.getLogger(QuestionServiceHelper.class);
    private static Response response = null;

    public void setResponseToNull(){
        response = null;
    }

    public QuestionServiceHelper() {
        super();
    }

    public void getQuestions() {
        LOGGER.info("fetching all questions.");
        response = RestAssured.given()
                .get(Endpoints.GET_QUESTION)
                .andReturn();
        Assert.assertNotNull("Rest Assured response ", response);
        LOGGER.info("fetched all questions.");
    }

    public void validateResponseStatusCode(String expStatusCode) {
        Assert.assertNotNull("Rest Assured response ", response);
        Assert.assertEquals(expStatusCode, response.getStatusCode(), "Http status");
    }

    public void createQuestion() {
        LOGGER.info("create a question.");
        Question question = new Question();
        question.setId(1);
        question.setQuestion("How much is a foot in meters ?");
        question.setAnswer("Dont know... ");

        setAuthUser("SIT5");
        response = RestAssured.given()
                .header("content-type", "application/json")
                .accept("application/json")
                .body(question)
                .post(Endpoints.GET_QUESTION)
                .andReturn();

        Assert.assertNotNull("Rest Assured response ", response);
        Assert.assertEquals("200", response.getStatusCode(), "Http status");
        LOGGER.info("question created.");
    }


}
