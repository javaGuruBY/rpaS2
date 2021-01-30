package by.jrr.service;

import by.jrr.bean.User;

public interface IUserService {
    boolean logIn(User user, String enteredLogin, String enteredPassword);
}

