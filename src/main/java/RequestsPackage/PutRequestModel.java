package RequestsPackage;

import BaseUtils.BaseClass;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutRequestModel extends BaseClass {

    private String JSON_BODY_PUT_REQUEST = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";

    private String PUT_URL_REQUEST = BASE_URL + "users/3";

    protected void updateUserInfo() {
        given()
                .contentType(CONTENT_TYPE)
                .body(JSON_BODY_PUT_REQUEST)
                .when()
                .put(PUT_URL_REQUEST)
                .then()
                .statusCode(200)
                .contentType(CONTENT_TYPE)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("zion resident"));
    }
}
