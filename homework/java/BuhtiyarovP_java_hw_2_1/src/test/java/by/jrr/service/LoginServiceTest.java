package by.jrr.service;

import by.jrr.been.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    LoginService loginService;
    User user;
    User blockedUser;
    String positiveUserInput = "password";
    String negativeUserInput = "wrong";

    public LoginServiceTest() {
    }

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
    public void checkUserPassword_positive() {

        boolean actionResult = this.loginService.login(user, positiveUserInput);
        Assert.assertTrue(actionResult);
    }

    @Test
    public void checkUserPassword_negative() {

        boolean actionResult = this.loginService.login(user, negativeUserInput);
        Assert.assertFalse(actionResult);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.login(user,negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void login_positive(){

        boolean actionResult = this.loginService.login(user, positiveUserInput);
        Assert.assertTrue(actionResult);
    }

    @Test
    public void login_negative(){

        boolean actionResult = this.loginService.login(user, negativeUserInput);
        Assert.assertFalse(actionResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUser(){
        user.setLoginAttempts(1);
        loginService.login(user,negativeUserInput);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPassword_UserIsBlocked(){

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void blockedUserLogin_ShouldReturnFalse(){
        boolean actualReturn = loginService.login(blockedUser,positiveUserInput);
        Assert.assertFalse(actualReturn);
    }

    @Test
    public void restoreAttempts(){
        user.setLoginAttempts(1);
        loginService.login(user,positiveUserInput);
        Assert.assertEquals(3,user.getLoginAttempts());
    }

    @Test
    public void after1Incorrect_shouldAttempts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3,user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_shouldAttempts() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_shouldAttempts() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0,user.getLoginAttempts());
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
