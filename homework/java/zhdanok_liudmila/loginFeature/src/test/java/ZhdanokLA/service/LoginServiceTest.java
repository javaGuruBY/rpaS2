package ZhdanokLA.service;

import ZhdanokLA.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    String positive_userInput = "password";
    String negative_userInput = "wrong";

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }

    @Test
    public void checkUserPassword_positiv() {
        boolean actualResult = loginService.checkUserPassword(user, positive_userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_negative() {
        boolean actualResult = loginService.checkUserPassword(user, negative_userInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttemps() {
        loginService.reduceLoginAttemps(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void login_positive() {
        boolean actualResult = loginService.login(user, positive_userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void login_negative() {
        boolean actualResult = loginService.login(user, negative_userInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUser() {
        loginService.blockUser(user);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUser() {

        loginService.login(user, negative_userInput);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negative_userInput);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negative_userInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());

    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }
}