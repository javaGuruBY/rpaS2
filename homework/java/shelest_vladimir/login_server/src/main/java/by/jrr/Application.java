package by.jrr;

import by.jrr.bean.User;
import by.jrr.service.UserService;

public class Application {

    public static void main(String[] args) {
        User user = new User("Login", "Password");

        UserService service = new UserService(user);
        service.logIn("Login", "Password");
    }
}
