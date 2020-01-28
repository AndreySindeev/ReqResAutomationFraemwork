package Tests;

import RequestsPackage.PostRequestModel;
import org.junit.Test;

public class TestPostRequests extends PostRequestModel {


    @Test
    public void testCreateUser(){
        createUserAndVerify();
    }

    @Test
    public void testRegisterUser(){
        verifyRegisterUser(true);
        verifyRegisterUser(false);
    }
}
