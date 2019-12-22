import java.util.Scanner;

public class numberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number count:");
        double numberCount = in.nextDouble();
        if (numberCount >= 1 && numberCount <= 10) {
            int Sum = 0;
            for (int i = 1; i <= numberCount; i++) {
                System.out.println("Please enter number: ");
                Sum += in.nextDouble();
            }
            System.out.println("Sum is " + Sum);
        } else {
            System.out.println("Your number is incorrect.");
        }
    }
}
