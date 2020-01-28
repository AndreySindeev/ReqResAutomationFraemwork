package Tests;



import RequestsPackage.GetRequestModel;
import org.junit.Test;

public class TestGetRequests extends GetRequestModel {

    @Test
    public void testGetListUsersInfo(){
        verifyFirstNameInformationAboutListsUser();
        verifyLastNameNameInfoAboutListsUser();
        verifyEmailInfoAboulListsUser();
    }

    @Test
    public void testGetSingleUserInfo(){
        verifyInformationAboutSingleUser();
    }

    @Test
    public void testSingleUserNotFound(){
        verifyGET404Error(true);
        verifyGET404Error(false);

    }





}
