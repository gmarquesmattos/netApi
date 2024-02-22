package br.com.net.automacao.testCases.auth;


import br.com.net.automacao.request.AuthDTO;
import br.com.net.automacao.util.AuthObjects;
import org.apache.http.HttpStatus;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class AuthTest {

    public AuthDTO authDTO;

    @BeforeClass
    public void setup() {
        authDTO = AuthObjects.buildauth();
    }

          @Test(testName = "Teste post-01 criação feita com sucesso")
        public void test_01() {
            given()
                    .body(authDTO)
                    .when()
                    .post("https://reqres.in/api/users")
                    .then()
                    .log().all()
                    .statusCode(HttpStatus.SC_CREATED);

        }
    @Test(testName = "Teste verificação das informações")
    public void test_02() {
        given()
                .body(authDTO)
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
         .body("data.id[0]", CoreMatchers.is(1))
         .body("data.email[0]", CoreMatchers.is("george.bluth@reqres.in"))
          .body("data.first_name[0]", CoreMatchers.is("George"))
           .body("data.last_name[0]", CoreMatchers.is("Bluth"));

    }

    @Test(testName = "Teste verificação de contrato")
    public void test_03() {
        String responsebody =
        given()
                .body(authDTO)
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .log().all()
                .extract()
                .body()
                .asString();
        assertThat(responsebody, matchesJsonSchemaInClasspath("src/test/java/br/com/sicredi/automacao/testCases/auth"));
    }

    }


