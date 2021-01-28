package by.jrr.petranovski.service;

import by.jrr.petranovski.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    private User user;
    private LoginService test;
    private final String positiveInputPassword = "password";
    private final String negativeInputPassword = "wrong";

    @Before
    public void setUp() {

        this.test = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }

    @Test
    public void checkUserPasswordTrueTest() {
        boolean actualResult = test.checkUserPassword(user, positiveInputPassword);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordFalseTest() {
        boolean actualResult = test.checkUserPassword(user, negativeInputPassword);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts() {
        test.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void loginTrueTest() {
        boolean actualResult = test.login(user, positiveInputPassword);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void loginFalseTest() {
        boolean actualResult = test.login(user, negativeInputPassword);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUserTest() {
        test.blockUser(user);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUser() {
        test.login(user, negativeInputPassword);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        test.login(user, negativeInputPassword);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        test.login(user, negativeInputPassword);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());

    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

}