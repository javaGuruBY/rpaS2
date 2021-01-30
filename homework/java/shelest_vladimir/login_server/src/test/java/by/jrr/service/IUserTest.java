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
    public void reduceAttemptsTest() {
        User user = new User("Login", "Password");
        UserService service = new UserService();

        user.setAttempt(1); // last chance
        service.logIn(user, "Login", "IncorrectPassword");

        boolean expected = true;
        boolean actual = user.getBlocked();

        Assert.assertEquals(expected, actual);
    }


}
