package Tests;

import RequestsPackage.DeleteRequestModel;
import org.junit.Test;

public class TestDeleteRequests extends DeleteRequestModel {


    /*
     * Delete user and getting 204 HTTP status code
     * */
    @Test
    public void testDeleteUser() {
        deleteUser();
    }


}
