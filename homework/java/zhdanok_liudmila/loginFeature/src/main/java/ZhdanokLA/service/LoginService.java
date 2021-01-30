package ZhdanokLA.service;

import ZhdanokLA.bean.User;

public class LoginService {

    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
            return  false;

    }

    private void updateUserStatus(User user, boolean result) {
        if (result) {
            restoreAttempts(user);
        } else {
            blockIfLoginAttamptExeeded(user);
        }
    }

    private void blockIfLoginAttamptExeeded(User user) {
        reduceLoginAttemps(user);
        if (user.getLoginAttempts() == 0) {
            blockUser(user);
        }
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttemps(User user) {
        user.setLoginAttempts(user.getLoginAttempts()-1);

    }



    private void blockUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttempts(3);

    }
}
