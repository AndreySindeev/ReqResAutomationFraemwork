package BaseUtils;



public class BaseClass {



    protected String BASE_URL = "https://reqres.in/api/";

    protected String CONTENT_TYPE = "application/json";

    public int generateRandomNumber(){
        int min = 15;
        int max = 30;
        int randomID = (int) (Math.random()* max + min);
        return randomID;
    }




}
