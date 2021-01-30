package ZhdanokLA.service;

import ZhdanokLA.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    User blockedUser;
    String positive_userInput = "password";
    String negative_userInput = "wrong";

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();

        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void checkUserPassword_positiv() {
        boolean actualResult = loginService.login(user, positive_userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_negative() {
        boolean actualResult = loginService.login(user, negative_userInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttemps() {
        loginService.login(user, negative_userInput);
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
        user.setLoginAttempts(1);
        loginService.login(user, negative_userInput);
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

    @Test
    public void blockedUserLogin_ShoulsReturnFalse(){
        boolean actualResult = loginService.login(blockedUser, positive_userInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void restoreAttempts() {
        user.setLoginAttempts(1);
        loginService.login(user, positive_userInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after1Incorrect_shouldRestoreAttempts() {
        loginService.login(user, negative_userInput);
        loginService.login(user, positive_userInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_shouldRestoreAttempts() {
        loginService.login(user, negative_userInput);
        loginService.login(user, negative_userInput);
        loginService.login(user, positive_userInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_shouldRestoreAttempts() {
        loginService.login(user, negative_userInput);
        loginService.login(user, negative_userInput);
        loginService.login(user, negative_userInput);
        boolean actualResult = loginService.login(user, positive_userInput);
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