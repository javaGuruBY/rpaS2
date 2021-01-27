package by.jrr.service;

public interface IUser {
    boolean IsCorrectLogin (String enteredLogin);
    boolean IsCorrectPassword (String enteredPassword);
    //void LogIn(String enteredLogin, String enteredPassword);
}
