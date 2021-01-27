package by.jrr.petranovski.service;

import by.jrr.petranovski.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    private LoginService test;

    @Before
    public void setUp() {
        this.test = new LoginService();
    }

    @Test
    public void checkUserPasswordTrueTest() {
        User user = getUser();
        String userInput = "password";
        boolean actualResult = test.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordFalseTest() {
        User user = getUser();
        String userInput = "passw";
        boolean actualResult = test.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

}