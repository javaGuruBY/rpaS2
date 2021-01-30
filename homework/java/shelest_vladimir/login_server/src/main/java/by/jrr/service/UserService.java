package by.jrr.service;

import by.jrr.bean.User;

public class UserService implements IUserService {

    private void reduceAttempts(User user) {
        user.setAttempt(user.getAttempt() - 1);
        if (user.getAttempt() <= 0)
            user.blockUser();
    }

    private void restoreAttempts(User user) {
        user.setAttempt(User.MAX_NUMBER_ATTEMPTS);
    }

    private boolean isCorrectLogin(User user, String enteredLogin) {
        return user.getLogin().equals(enteredLogin);
    }

    private boolean isCorrectPassword(User user, String enteredPassword) {
        boolean isCorrect = user.getPassword().equals(enteredPassword);
        if (isCorrect) {
            this.restoreAttempts(user);
        }
        else {
            this.reduceAttempts(user);
        }
        return isCorrect;
    }

    @Override
    public boolean logIn(User user, String enteredLogin, String enteredPassword) {
        boolean isSuccessLogin = false;
        if (!user.getBlocked() &&
                this.isCorrectLogin(user, enteredLogin) &&
                this.isCorrectPassword(user, enteredPassword)) {
            System.out.println("You successfully login!");
            isSuccessLogin = true;
        }
        return isSuccessLogin;
    }
}
