package by.jrr;

import by.jrr.bean.User;

public class Application {

    public static void main(String[] args) {
        User user = new User("Login", "Password");

        user.LogIn("Login", "Password");
    }
}
