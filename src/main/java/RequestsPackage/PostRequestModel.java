package RequestsPackage;

import BaseUtils.BaseClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequestModel extends BaseClass {

    private String POST_URL_CREATE_USER = BASE_URL + "users";

    private String POST_URL_REGISTER_USER = BASE_URL + "register";

    private final String JSON_BODY_CREATE_USER = "{\"name\": \"Andrey\", \"job\": \"Software QA engineer\"}";

    private final String JSON_BODY_REGISTER_USER = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";

    private final String JSON_BODY_INVALID_REGISTER_USER = "{\"email\": \"random@user213\"}";

    private final String TOKEN_REGISTRED = "QpwL5tke4Pnpja7X4";

    protected void createUserAndVerify() {
        given()
                .contentType(CONTENT_TYPE)
                .body(JSON_BODY_CREATE_USER)
                .when()
                .post(POST_URL_CREATE_USER)
                .then()
                .statusCode(201)
                .contentType(CONTENT_TYPE)
                .body("name", equalTo("Andrey"))
                .body("job", equalTo("Software QA engineer"));
    }

    protected void verifyRegisterUser(boolean SuccessfullUnsuccessfulRegister) {
        if (SuccessfullUnsuccessfulRegister) {
            registredUser(POST_URL_REGISTER_USER, JSON_BODY_REGISTER_USER, 200);
        } else {
            registredUser(POST_URL_REGISTER_USER, JSON_BODY_INVALID_REGISTER_USER, 400);
        }
    }

    private void registredUser(String RegisterURL, String ValidJson, int StatusCode) {
        given()
                .contentType(CONTENT_TYPE)
                .body(ValidJson)
                .when()
                .post(RegisterURL)
                .then()
                .statusCode(StatusCode);

    }

}
