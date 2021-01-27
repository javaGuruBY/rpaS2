package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

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
    public void LogIn() {
        User user = new User("Login", "Password");

        String enteredLogin = "Login";
        String enteredPassword = "Password";

        String expected = "You successfully login!";
        String actual;

        if (!user.get_isBlocked()) {
            if (user.IsCorrectLogin(enteredLogin)) {
                if (user.IsCorrectPassword(enteredPassword)) {
                    actual = "You successfully login!";
                }
                else {
                    actual = "User has entered incorrect password!";
                }
            }
            else {
                actual = "User has entered incorrect login!";
            }
        }
        else {
            actual = "User is blocked!";
        }

        Assert.assertEquals(expected, actual);
    }
}
