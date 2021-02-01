package by.jrr.service;

import by.jrr.been.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttemps(user.getLoginAttemps()-1);
    }

    public boolean login(User user, String userInput) {
        if(user.getLoginAttemps() == 1)
            blockUser(user);
        reduceLoginAttempts(user);
        return checkUserPassword(user, userInput);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }
}
