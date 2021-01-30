package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

public class IUserTest {
    @Test
    public void logInTest() {
        User user = new User("Login", "Password");
        UserService service = new UserService();

        boolean expected = true;
        boolean actual = service.logIn(user, "Login", "Password");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incorrect_LogIn_Test() {
        User user = new User("Login", "Password");
        UserService service = new UserService();
        boolean expected = false;
        boolean actual;

        user.blockUser();
        actual = service.logIn(user, "Login", "Password");
        Assert.assertEquals(expected, actual);
        user.unblockUser();

        actual = service.logIn(user, "IncorrectLogin", "Password");
        Assert.assertEquals(expected, actual);

        actual = service.logIn(user, "Login", "IncorrectPassword");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reduceAttempts_WhenUserShouldBeBlocked_Test() {
        User user = new User("Login", "Password");
        UserService service = new UserService();

        user.setAttempt(1); // last chance
        service.logIn(user, "Login", "IncorrectPassword");

        boolean expected = true;
        boolean actual = user.getBlocked();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reduceAttempts_WhenUserNotShouldBeBlocked_Test() {
        User user = new User("Login", "Password");
        UserService service = new UserService();

        service.logIn(user, "Login", "IncorrectPassword");

        boolean expected = false;
        boolean actual = user.getBlocked();

        Assert.assertEquals(expected, actual);
    }
}
