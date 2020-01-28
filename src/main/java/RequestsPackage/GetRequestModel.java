package RequestsPackage;

import BaseUtils.BaseClass;
import DataProvider.ListAccountsDataProvider;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequestModel extends BaseClass {

    private String GET_SINGLE_USER_INFO = BASE_URL + "users/2";
    private String GET_LISTS_USERS = BASE_URL + "users?page=1";


    protected void verifyInformationAboutSingleUser() {
        given()
                .when()
                .get(GET_SINGLE_USER_INFO)
                .then()
                .contentType(ContentType.JSON)
                .body("data.first_name", equalTo(ListAccountsDataProvider.JANET.getFirstName()))
                .body("data.last_name", equalTo(ListAccountsDataProvider.JANET.getLastName()))
                .body("data.id", equalTo(ListAccountsDataProvider.JANET.getId()))
                .body("data.avatar", equalTo(ListAccountsDataProvider.JANET.getAvatarUri()));

    }

    protected void verifyGET404Error(boolean singleORsingleResourceNotFound) {
        int randomNumber = generateRandomNumber();
        if (singleORsingleResourceNotFound) {
            GetRequest404Error(randomNumber, BASE_URL + "users/");
        } else {
            GetRequest404Error(randomNumber, BASE_URL + "unknown/");
        }
    }

    private void GetRequest404Error(int randomNumber, String URLrequest) {
        given()
                .when()
                .get(URLrequest + randomNumber)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(404);
    }


    protected void verifyFirstNameInformationAboutListsUser() {
        given()
                .when()
                .get(GET_LISTS_USERS)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("data[0].first_name", equalTo(ListAccountsDataProvider.GEORGE.getFirstName()))
                .body("data[1].first_name", equalTo(ListAccountsDataProvider.JANET.getFirstName()))
                .body("data[2].first_name", equalTo(ListAccountsDataProvider.EMMA.getFirstName()))
                .body("data[3].first_name", equalTo(ListAccountsDataProvider.EVE.getFirstName()))
                .body("data[4].first_name", equalTo(ListAccountsDataProvider.CHARLES.getFirstName()))
                .body("data[5].first_name", equalTo(ListAccountsDataProvider.TRACEY.getFirstName()));
    }

    protected void verifyLastNameNameInfoAboutListsUser() {
        given()
                .when()
                .get(GET_LISTS_USERS)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("data[0].last_name", equalTo(ListAccountsDataProvider.GEORGE.getLastName()))
                .body("data[1].last_name", equalTo(ListAccountsDataProvider.JANET.getLastName()))
                .body("data[2].last_name", equalTo(ListAccountsDataProvider.EMMA.getLastName()))
                .body("data[3].last_name", equalTo(ListAccountsDataProvider.EVE.getLastName()))
                .body("data[4].last_name", equalTo(ListAccountsDataProvider.CHARLES.getLastName()))
                .body("data[5].last_name", equalTo(ListAccountsDataProvider.TRACEY.getLastName()));
    }

    protected void verifyEmailInfoAboulListsUser() {
        given()
                .when()
                .get(GET_LISTS_USERS)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .body("data[0].email", equalTo(ListAccountsDataProvider.GEORGE.getEmail()))
                .body("data[1].email", equalTo(ListAccountsDataProvider.JANET.getEmail()))
                .body("data[2].email", equalTo(ListAccountsDataProvider.EMMA.getEmail()))
                .body("data[3].email", equalTo(ListAccountsDataProvider.EVE.getEmail()))
                .body("data[4].email", equalTo(ListAccountsDataProvider.CHARLES.getEmail()))
                .body("data[5].email", equalTo(ListAccountsDataProvider.TRACEY.getEmail()));
    }


}
