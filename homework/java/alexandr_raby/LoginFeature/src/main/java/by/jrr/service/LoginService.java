package by.jrr.service;

import by.jrr.bean.User;

import java.nio.charset.StandardCharsets;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
    return user.getPassword().equals(userInput);
    }
}