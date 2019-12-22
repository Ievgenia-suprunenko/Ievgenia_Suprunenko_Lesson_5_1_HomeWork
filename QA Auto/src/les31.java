import java.util.Scanner;

public class les31 {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String userName = consoleInput.next();

        boolean isITEAUser = userName.equals("itea");

        if (isITEAUser) {
            System.out.println("Good day,Itea");
        } else {
            System.out.println("Hello, " + userName);
        }
    }
}
