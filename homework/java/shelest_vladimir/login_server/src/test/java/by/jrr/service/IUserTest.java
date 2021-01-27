package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

import static org.junit.Assert.*;

public class IUserTest {
    @Test
    public void IsCorrectLogin() {
        User user = new User("Login", "Password");
        String enteredLogin = "Login";

        boolean expected = true;

        boolean actual = user.IsCorrectLogin(enteredLogin);
        Assert.assertEquals(expected, actual);
    }
}
