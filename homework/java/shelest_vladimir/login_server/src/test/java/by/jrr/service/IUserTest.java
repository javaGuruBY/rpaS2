package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

import javax.print.MultiDocPrintService;

import static org.junit.Assert.*;

public class IUserTest {
    @Test
    public void IsCorrectLogin_True() {
        User user = new User("Login", "Password");
        String enteredLogin = "Login";

        boolean expected = true;
        boolean actual = user.IsCorrectLogin(enteredLogin);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IsCorrectLogin_False() {
        User user = new User("Login", "Password");
        String enteredLogin = "IncorrectLogin";

        boolean expected = false;
        boolean actual = user.IsCorrectLogin(enteredLogin);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IsCorrectPassword_True() {
        User user = new User("Login", "Password");
        String enteredPassword = "Password";

        boolean expected = true;
        boolean actual = user.IsCorrectPassword(enteredPassword);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IsCorrectPassword_False() {
        User user = new User("Login", "Password");
        String enteredPassword = "IncorrectPassword";

        boolean expected = false;
        boolean actual = user.IsCorrectPassword(enteredPassword);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ReduceAttemptsTest() {
        User user = new User("Login", "Password");
        user.set_attempt(3);

        int expected = 2;
        user.ReduceAttempts();
        int actual = user.get_attempt();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RestoreAttemptsTest() {
        User user = new User("Login", "Password");
        user.set_attempt(1);

        int expected = 3;
        user.RestoreAttempts();
        int actual = user.get_attempt();

        Assert.assertEquals(expected, actual);
    }
}
