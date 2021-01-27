package by.jrr.petranovski.service;

import by.jrr.petranovski.bean.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
