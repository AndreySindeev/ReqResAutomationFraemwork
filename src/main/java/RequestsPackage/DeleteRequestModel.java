package RequestsPackage;

import BaseUtils.BaseClass;

import static io.restassured.RestAssured.given;

public class DeleteRequestModel extends BaseClass {

    private String URL_DELETE_USER = BASE_URL + "users/2";

    protected void deleteUser() {
        given()
                .when()
                .delete(URL_DELETE_USER)
                .then()
                .statusCode(204);
    }
}




