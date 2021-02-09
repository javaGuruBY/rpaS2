package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

public class IUserTest {
    @Test
    public void LogIn() {
        User user = new User("Login", "Password");

        String enteredLogin = "Login";
        String enteredPassword = "Password";

        boolean expected = true;
        boolean actual = user.LogIn("Login", "Password");

        Assert.assertEquals(expected, actual);
    }
}
