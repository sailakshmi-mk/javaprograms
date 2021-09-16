import java.util.*;

class AuthenticationException extends Exception {

    public String toString() {
        return "*Username and password not matching!!!\n";
    }
}

class Authentication {
    String userName, password;

    Authentication(String User, String Pass) throws AuthenticationException {
        Scanner read = new Scanner(System.in);
        System.out.print("\nEnter the Username: ");
        userName = read.nextLine();
        System.out.print("\nEnter the Password: ");
        password = read.nextLine();
        if ((userName.compareTo(User) != 0) || (password.compareTo(Pass) != 0)) {
            throw new AuthenticationException();
        }
    }
}

public class AuthenticateUser {
    public static void main(String[] args) {
        try {
            Authentication A = new Authentication("Samuel", "Sam@123");
            System.out.println("\n\t\t\t*Successfull\n");
        } catch (AuthenticationException e) {
            System.out.println("\n\t\t\tAuthenticationException: " + e);
        }
    }
}
