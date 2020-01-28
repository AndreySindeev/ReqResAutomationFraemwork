package Tests;


import RequestsPackage.GetRequestModel;
import org.junit.Test;

public class TestGetRequests extends GetRequestModel {

    /*
     * Get User Info from JSON LIST
     * */

    @Test
    public void testGetListUsersInfo() {
        verifyFirstNameInformationAboutListsUser();
        verifyLastNameNameInfoAboutListsUser();
        verifyEmailInfoAboulListsUser();
    }

    /*
     * Get User info for single user
     * */

    @Test
    public void testGetSingleUserInfo() {
        verifyInformationAboutSingleUser();
    }


    /*
     * Negative test cases for gettiong 404 status code from reqres API
     * */
    @Test
    public void testSingleUserNotFound() {
        verifyGET404Error(true);
        verifyGET404Error(false);

    }


}
