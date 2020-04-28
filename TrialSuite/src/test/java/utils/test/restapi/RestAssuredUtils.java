package utils.test.restapi;

import com.jayway.restassured.authentication.PreemptiveBasicAuthScheme;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.specification.RequestSpecification;

public class RestAssuredUtils {

    public RequestSpecification sendRestRequest(String user, String url, Object reqBody) {
        PreemptiveBasicAuthScheme basicAuthScheme = getPreemptiveBasicAuth("user");
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        if (reqBody != null) {
            reqBuilder.setBody("");
        }
        reqBuilder.setContentType("");
        reqBuilder.setRelaxedHTTPSValidation();
        reqBuilder.setAuth(basicAuthScheme);
        return reqBuilder.build();
    }

    private PreemptiveBasicAuthScheme getPreemptiveBasicAuth(String user) {
        //TODO get user data from user.xml
        PreemptiveBasicAuthScheme basicAuthScheme;
        basicAuthScheme = new PreemptiveBasicAuthScheme();
        basicAuthScheme.setUserName("");
        basicAuthScheme.setPassword("");
        return basicAuthScheme;
    }


}
