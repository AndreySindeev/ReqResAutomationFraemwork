package DataProvider;

public enum ListAccountsDataProvider {

    GEORGE("george.bluth@reqres.in", "George", "Bluth", "https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg", 1),
    JANET("janet.weaver@reqres.in","Janet", "Weaver", "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg", 2),
    EMMA("emma.wong@reqres.in", "Emma", "Wong", "https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg", 3),
    EVE("eve.holt@reqres.in", "Eve", "Holt", "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg", 4),
    CHARLES("charles.morris@reqres.in", "Charles", "Morris", "https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg", 5),
    TRACEY("tracey.ramos@reqres.in", "Tracey", "Ramos", "https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg", 6);

    String email;
    String firstName;
    String lastName;
    String avatarUri;
    int id;

    ListAccountsDataProvider(String email, String firstName, String lastName, String avatarUri, int id) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatarUri = avatarUri;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public int getId() {
        return id;
    }
}
