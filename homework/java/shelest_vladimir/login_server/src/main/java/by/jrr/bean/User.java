package by.jrr.bean;

import by.jrr.service.IUser;
import java.util.Objects;

public class User implements IUser {
    private final int MAX_NUMBER_ATTEMPTS = 3;

    private String _login;
    private String _password;
    private int _attempt;
    private boolean _isBlocked;

    public User(String login, String password) {
        this._login = login;
        this._password = password;
        // Max number of attempts
        this._attempt = MAX_NUMBER_ATTEMPTS;
        // User is unblocked
        this._isBlocked = false;
    }

    public String get_login() {
        return _login;
    }

    public void set_login(String login) {
        this._login = login;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String password) {
        this._password = password;
    }

    public int get_attempt() {
        return _attempt;
    }

    public void set_attempt(int attempt) {
        this._attempt = attempt;
    }

    public boolean get_isBlocked() {
        return _isBlocked;
    }

    public void blockUser() {
        this._isBlocked = false;
    }

    @Override
    public String toString() {
        return "User{" +
                "_login='" + _login + '\'' +
                ", _password='" + _password + '\'' +
                ", _attempt=" + _attempt +
                ", _isBlocked=" + _isBlocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return _attempt == user._attempt && _isBlocked == user._isBlocked && Objects.equals(_login, user._login) && Objects.equals(_password, user._password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_login, _password, _attempt, _isBlocked);
    }

    @Override
    public boolean IsCorrectLogin(String enteredLogin) {
        boolean incorrectLogin = _login.equals(enteredLogin);
        if (!incorrectLogin)
            this.ReduceAttempts();
        else
            this.RestoreAttempts();

        return incorrectLogin;
    }

    @Override
    public boolean IsCorrectPassword(String enteredPassword) {
        return _password.equals(enteredPassword);
    }

    @Override
    public void ReduceAttempts() {
        --_attempt;
        if (_attempt == 0)
            this.blockUser();
    }

    @Override
    public void RestoreAttempts() {
        _attempt = MAX_NUMBER_ATTEMPTS;
    }
}
