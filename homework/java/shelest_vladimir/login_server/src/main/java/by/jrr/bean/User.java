package by.jrr.bean;

import java.util.Objects;

public class User {
    public static final int MAX_NUMBER_ATTEMPTS = 3;

    private String mLogin;
    private String mPassword;
    private int mAttempt;
    private boolean mBlocked;

    public User(String login, String password) {
        this.mLogin = login;
        this.mPassword = password;
        this.mAttempt = MAX_NUMBER_ATTEMPTS;
        this.mBlocked = false;
    }

    public User(User user) {
        this.mLogin = user.mLogin;
        this.mPassword = user.mPassword;
        this.mAttempt = user.mAttempt;
        this.mBlocked = user.mBlocked;
    }

    public String getLogin() {
        return mLogin;
    }

    public String getPassword() {
        return mPassword;
    }

    public int getAttempt() {
        return mAttempt;
    }

    public void setAttempt(int attempt) {
        this.mAttempt = attempt;
    }

    public boolean getBlocked() {
        return mBlocked;
    }

    public void blockUser() {
        this.mBlocked = true;
        this.mAttempt = 0;
    }

    public void unblockUser() {
        this.mBlocked = false;
        this.mAttempt = MAX_NUMBER_ATTEMPTS;
    }

    @Override
    public String toString() {
        return "User{" +
                "login = '" + mLogin + '\'' +
                ", password = '" + mPassword + '\'' +
                ", attempt = " + mAttempt +
                ", is blocked = " + mBlocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(mLogin, user.mLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mLogin);
    }
}
