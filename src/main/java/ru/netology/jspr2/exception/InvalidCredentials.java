package ru.netology.jspr2.exception;

public class InvalidCredentials extends RuntimeException{

    public InvalidCredentials(String message) {
        super(message);
    }

}
