package by.jrr.service;

import org.junit.Assert;
import org.junit.Test;
import by.jrr.bean.User;

public class IUserTest {
    @Test
    public void LogIn() {
        User user = new User("Login", "Password");
        UserService service = new UserService(user);

        boolean expected = true;
        boolean actual = service.logIn("Login", "Password");

        Assert.assertEquals(expected, actual);
    }
}
