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


    @Before
    public  void  setUp(){
        this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();
        Assert.assertEquals(3, user.getLoginAttemps());
        Assert.assertFalse(user.isBlocked());

        Assert.assertEquals(0, blockedUser.getLoginAttemps());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public  void checkUserPassword_positive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public  void checkUserPassword_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts(){
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttemps());
    }
    @Test
    public  void login_positive(){
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }
    @Test
    public  void login_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttemps());
    }
    @Test
    public void blockUser(){
        user.setLoginAttemps(1);
        loginService.login(user, negativeUserInput);
        Assert.assertTrue(user.isBlocked());
    }
    @Test
    public  void  after3WrongPassword_ShouldBlockedUser(){
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttemps());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttemps());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttemps());
        Assert.assertTrue(user.isBlocked());
    }
    @Test
    public void blockUserLogin_ShouldReturnFalse(){
        boolean actualResult = loginService.login(blockedUser, positiveUserInput);
        Assert.assertFalse(actualResult);
    }
    @Test
    public void restoreAttempts(){
        user.setLoginAttemps(1);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttemps());
    }
    @Test
    public void after1Incorrect_ShouldRestoreAttampts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttemps());
    }
    @Test
    public void after2Incorrect_ShouldRestoreAttampts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttemps());
    }
    @Test
    public void after3Incorrect_ShouldRestoreAttampts(){
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0, user.getLoginAttemps());
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
        user.setLoginAttemps(0);
        user.setBlocked(true);
        return user;
    }
}