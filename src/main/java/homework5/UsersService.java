package homework5;

public interface UsersService {
    void signUp(String email, String password) throws BadEmailException, BadPasswordException;
    void signIn(String email, String password) throws UserNotFoundException;
}
