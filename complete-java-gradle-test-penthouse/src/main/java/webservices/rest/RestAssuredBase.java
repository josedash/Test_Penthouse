package webservices.rest;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class RestAssuredBase {

    private static Logger LOGGER = LogManager.getLogger(RestAssuredBase.class);
    private static Response response = null;

    protected void setResponseToNull() {
        response = null;
    }

    protected RestAssuredBase() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "";
    }

    protected static void setAuthUser(String user) {
        if (user.trim().isEmpty() || user == null) {
            LOGGER.info("No authentication was set to request. User value is empty.");
        } else {
            LOGGER.info("Authentication is being set to request for user : " + user);
            PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
            authScheme.setUserName(user);
            authScheme.setPassword("");
            RestAssured.authentication = authScheme;
            LOGGER.info("Authentication has been set to request for user : " + user);
        }
    }

    /**
     * A proxy server is an intermediary server that is viruatlly located between the client and the server. All calls
     * are made by the proxy server.
     * @param proxy
     * @param port
     */
    protected static void setProxy(String proxy, String port){
        if(proxy.trim().isEmpty() || port.trim().isEmpty()){
            Assert.assertTrue("Proxy or port info are empty. ",false);
        }else{
            RestAssured.proxy("", Integer.parseInt(port));
        }
    }


}
