package by.jrr.petranovski.service;

import by.jrr.petranovski.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    private User user;
    private LoginService test;


    @Before
    public void setUp() {

        this.test = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void checkUserPasswordTrueTest() {
        String userInput = "password";
        boolean actualResult = test.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordFalseTest() {
        String userInput = "passw";
        boolean actualResult = test.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts() {
        test.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginTrueTest() {
        String userInput = "password";
        boolean actualResult = test.login(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void loginFalseTest() {
        String userInput = "passw";
        boolean actualResult = test.login(user, userInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

}