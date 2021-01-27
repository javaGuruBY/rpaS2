package by.jrr.service;

public interface IUser {
    boolean IsCorrectLogin (String enteredLogin);
    boolean IsCorrectPassword (String enteredPassword);
    boolean LogIn(String enteredLogin, String enteredPassword);
}
