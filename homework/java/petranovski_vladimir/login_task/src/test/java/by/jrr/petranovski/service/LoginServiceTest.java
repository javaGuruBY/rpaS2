package by.jrr.petranovski.service;

import by.jrr.petranovski.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    private User user;
    private User blockedUser;
    private LoginService test;
    private final String positiveInputPassword = "password";
    private final String negativeInputPassword = "wrong";

    @Before
    public void setUp() {

        this.test = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();

        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void checkUserPasswordTrueTest() {
        boolean actualResult = test.login(user, positiveInputPassword);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPasswordFalseTest() {
        boolean actualResult = test.login(user, negativeInputPassword);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttemptsTest() {
        test.login(user, negativeInputPassword);
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
        user.setLoginAttempts(1);
        test.login(user, negativeInputPassword);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUserTest() {
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

    @Test
    public void blockedUserLogin_ShouldReturnFalseTest() {
        boolean actualResult = test.login(blockedUser, positiveInputPassword);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void restoreAttemptsTest() {
        user.setLoginAttempts(1);
        test.login(user, positiveInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after1Incorrect_ShouldRestoreAttemptsTest() {
        test.login(user, negativeInputPassword);
        test.login(user, positiveInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_ShouldRestoreAttemptsTest() {
        test.login(user, negativeInputPassword);
        test.login(user, negativeInputPassword);
        test.login(user, positiveInputPassword);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_ShouldRestoreAttemptsTest() {
        test.login(user, negativeInputPassword);
        test.login(user, negativeInputPassword);
        test.login(user, negativeInputPassword);
        boolean actualResult = test.login(user, positiveInputPassword);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }

}