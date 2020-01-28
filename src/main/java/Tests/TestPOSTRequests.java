package Tests;

import RequestsPackage.PostRequestModel;
import org.junit.Test;

public class TestPostRequests extends PostRequestModel {


    /*
     * Create user and verify name and job param's from JSON
     * */
    @Test
    public void testCreateUser() {
        createUserAndVerify();
    }

    /*
     * Positive testcase for verify registration user from API,
     * and negative testcase for verifying invalid registration user and getting 400 HTTP status code
     * */
    @Test
    public void testRegisterUser() {
        verifyRegisterUser(true);
        verifyRegisterUser(false);
    }
}
