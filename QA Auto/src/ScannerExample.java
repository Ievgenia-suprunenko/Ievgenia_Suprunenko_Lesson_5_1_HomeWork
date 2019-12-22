import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Please, input year: ");
        int year = consoleInput.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("User input's  years is leap ? " +isLeapYear);
    }
}
