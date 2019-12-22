import java.util.Scanner;

public class enterDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your digit: ");
            Sum += in.nextDouble();
        }
        System.out.println("Sum is " + Sum);
    }
}
