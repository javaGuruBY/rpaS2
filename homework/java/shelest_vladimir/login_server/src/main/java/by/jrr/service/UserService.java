package by.jrr.service;

import by.jrr.bean.User;

public class UserService implements IUserService {
    private User mUser;

    public UserService(User user) {
        mUser = new User(user);
    }

    private void reduceAttempts() {
        mUser.setAttempt(mUser.getAttempt() - 1);
        if (mUser.getAttempt() <= 0)
            mUser.blockUser();
    }

    private void restoreAttempts() {
        mUser.setAttempt(User.MAX_NUMBER_ATTEMPTS);
    }

    private boolean isCorrectLogin(String enteredLogin) {
        return mUser.getLogin().equals(enteredLogin);
    }

    private boolean isCorrectPassword(String enteredPassword) {
        boolean isCorrect = mUser.getPassword().equals(enteredPassword);
        if (isCorrect) {
            this.restoreAttempts();
        }
        else {
            this.reduceAttempts();
        }
        return isCorrect;
    }

    @Override
    public boolean logIn(String enteredLogin, String enteredPassword) {
        boolean isSuccessLogin = false;
        if (!mUser.getBlocked() &&
                this.isCorrectLogin(enteredLogin) &&
                this.isCorrectPassword(enteredPassword)) {
            System.out.println("You successfully login!");
            isSuccessLogin = true;
        }
        return isSuccessLogin;
    }
}
