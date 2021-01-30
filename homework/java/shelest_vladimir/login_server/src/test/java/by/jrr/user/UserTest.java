package by.jrr.user;

import by.jrr.bean.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class UserTest {
    @Test
    public void toString_Test() {
        User user = new User("Login", "Password");
        String expected = "User{" +
                "login = '" + "Login" + '\'' +
                ", password = '" + "Password" + '\'' +
                ", attempt = " + "3" +
                ", is blocked = " + "false" +
                '}';
        String actual = user.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equals_Test() {
        User user = new User("Login", "Password");
        User anotherUser = new User("Login", "AnotherPassword");

        boolean expected = true;
        boolean actual = user.equals(anotherUser);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equals_AnotherUser_Test() {
        User user = new User("Login", "Password");
        User anotherUser = new User("AnotherLogin", "Password");

        boolean expected = false;
        boolean actual = user.equals(anotherUser);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void failedEquales_NullOrOtherType_Test() {
        User user = new User("Login", "Password");
        boolean expected = false;

        boolean actual = user.equals(null);
        Assert.assertEquals(expected, actual);

        int anotherType = 1;
        actual = user.equals(anotherType);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hashCode_Test() {
       User user = new User("Login", "Password");

       int expected = Objects.hash("Login");
       int actual = user.hashCode();

       Assert.assertEquals(expected, actual);
    }

    @Test
    public void c_tor_OfCopying_Test() {
        User user1 = new User("Login", "Password");
        User user2 = new User(user1);

        boolean expected = true;
        boolean actual = user1.equals(user2);

        Assert.assertEquals(expected, actual);
    }
}
