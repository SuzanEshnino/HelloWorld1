package user;

public class User {
    private String myUserName;
    private String myPassword;
    private String typeOfUser;


    public User(String username, String password,String typeOfUsers) {

        myUserName = username;
        myPassword = password;
        typeOfUser = typeOfUsers;


    }


    public String getUserName() {

        return myUserName;
    }

    public String getPassword() {

        return myPassword;
    }

    public String newPassword() {

        return myPassword;
    }

    public String getTypeOfUser() {

        return typeOfUser;

    }

    public void getPasswordChar(String Newpass){
        if (Newpass.contains("#") || Newpass.contains("&") || Newpass.contains("$")){
            myPassword=Newpass;

        }


    }
}