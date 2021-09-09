package edu.innopolis.homework5;

public class BadPasswordException extends IllegalArgumentException{
    @Override
    public String getMessage() {
        return "Неверный формат пароля";
    }
}
