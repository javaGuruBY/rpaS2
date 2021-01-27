package by.jrr.bean;

import by.jrr.service.IUser;
import java.util.Objects;

public class User implements IUser {
    private final int NUMBER_ATTEMPTS = 3;
    private String _login;
    private String _password;
    private int _attempt;
    private boolean _isBlocked;

    public User(String login, String password) {
        this._login = login;
        this._password = password;
        // Max number of attempts
        this._attempt = 3;
        // User is unblocked
        this._isBlocked = false;
    }

    public String get_login() {
        return _login;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public int get_attempt() {
        return _attempt;
    }

    public void set_attempt(int _attempt) {
        this._attempt = _attempt;
    }

    public boolean is_isBlocked() {
        return _isBlocked;
    }

    public void set_isBlocked(boolean _isBlocked) {
        this._isBlocked = _isBlocked;
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
        return _login.equals(enteredLogin);
    }

    @Override
    public boolean IsCorrectPassword(String enteredPassword) {
        return _password.equals(enteredPassword);
    }

    @Override
    public void ReduceAttempts() {
        --_attempt;
    }

    @Override
    public void RestoreAttempts() {
        _attempt = 3;
    }


}
