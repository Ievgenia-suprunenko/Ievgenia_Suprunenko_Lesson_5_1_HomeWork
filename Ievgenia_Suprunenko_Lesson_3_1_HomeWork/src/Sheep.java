import java.util.Scanner;

public class Sheep {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Enter your digit: ");
            double Digit = in.nextDouble();
            if (Digit < 0) {
                System.out.println("Enter digit more than 0");
            } else {
                for (int i = 1; i <= Digit; i++) {
                    System.out.print(i + " Sheep... ");
                }
            }
        }
    }
}
