package edu.innopolis.homework5;

import java.util.NoSuchElementException;

public class UserNotFoundException extends NoSuchElementException {
    @Override
    public String getMessage() {
        return "Пользователь не найден";
    }
}
