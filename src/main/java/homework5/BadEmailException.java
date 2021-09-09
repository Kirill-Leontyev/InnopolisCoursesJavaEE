package homework5;

public class BadEmailException extends IllegalArgumentException{
    @Override
    public String getMessage() {
        return "Неверный формат почты";
    }
}
