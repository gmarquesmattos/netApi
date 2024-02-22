package br.com.net.automacao.util;

import br.com.net.automacao.request.AuthDTO;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;


import static br.com.net.automacao.util.Constantes.APP_CONTENT_TYPE;
import static io.restassured.RestAssured.given;

public class Factory {
    public AuthDTO authDTO;
  public static ResponseSpecification responseSpec;

    @BeforeClass
    public void setup() {
         ResponseSpecification responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
        authDTO = AuthObjects.buildauth();
        RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
        reqBuilder.setContentType(APP_CONTENT_TYPE);
        RestAssured.requestSpecification = reqBuilder.build();

        String TOKEN = given()
                .body(authDTO)
                .when()
                .post("")
                .then()
                //.statusCode(200)
                .extract().path("token");
        RestAssured.requestSpecification.header("Authorization", "Bearer " + TOKEN); //bearer em apis mais novas
    }
}
