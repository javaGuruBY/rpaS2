package ZhdanokLA.service;

import ZhdanokLA.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttemps(User user) {
        user.setLoginAttempts(user.getLoginAttempts()-1);

    }

    public boolean login(User user, String userInput) {
        if (user.getLoginAttempts() == 1) {
            blockUser(user);
        }
        reduceLoginAttemps(user);
        return checkUserPassword(user, userInput);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }
}
