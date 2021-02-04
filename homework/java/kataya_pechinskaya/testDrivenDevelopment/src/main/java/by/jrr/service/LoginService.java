package by.jrr.service;

import by.jrr.been.User;

public class LoginService {

    public boolean login(User user, String userInput) {
        if(!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
                return false;
    }

    private void updateUserStatus(User user, boolean result) {
        if (result) {
            restoreAttempts(user);
        } else {
            reduceLoginAttempts(user);
            blockIfLoginAttemptsExeeded(user);
        }
    }


    private void blockIfLoginAttemptsExeeded(User user) {
        if(user.getLoginAttemps() == 0){
            blockUser(user);}
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttemps(user.getLoginAttemps()-1);
    }

    private void blockUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttemps(3);
    }
}
