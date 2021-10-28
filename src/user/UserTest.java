package user;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testCreateUser() {
        String username = "OGStaffan";
        String newPassword = "Suzana";
        String userType= "normal";

        User myUser =new User(username, newPassword,userType);


        String actual = myUser.getUserName();

        String expected = "OGStaffan";

        assertEquals("OGStaffan", actual);


    }
    @Test
    public void testPassword() {
        String username = "OGStaffan";
        String newPassword = "staffan123";
        String userType= "normal";

        User myUser =new User(username, newPassword,userType);


        String actual = myUser.getPassword();

        String expected = "staffan123";

        assertEquals("staffan123", actual);
    }

    @Test
    public void passwordUpdate() {
        String username = "OGStaffan";
        String newPassword = "Suzana";
        String userType="normal";

        User myUser =new User(username, newPassword,userType);


        String actual = myUser.getPassword();

        String expected = "Suzana";

        assertEquals("Suzana", actual);
    }

    @Test
    public void TypeOfUser(){

        String username = "OGStaffan";
        String newPassword = "Suzana";
        String userType= "normal";

        User myUser =new User(username, newPassword,userType);

        String actual = myUser.getTypeOfUser();


        String expected = "normal";

        assertEquals(expected, actual);



    }

    @Test
    public void changePassword(){

        String username = "OGStaffan";
        String newPassword = "Suzana";
        String userType= "normal";

        User myUser =new User(username, newPassword,userType);
        myUser.getPasswordChar("Suzana#");

        String actual = myUser.getPassword();


        String expected = "Suzana#";

        assertEquals(expected, actual);




    }







}

