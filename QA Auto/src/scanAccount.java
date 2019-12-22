import java.util.Scanner;

public class scanAccount {
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Please give your First name: ");
        String firstName = consoleInput.next();
        System.out.println("Please give your Last name: ");
        String lastName = consoleInput.next();

        String result = firstName + lastName;
        System.out.println(result);

    }
}
