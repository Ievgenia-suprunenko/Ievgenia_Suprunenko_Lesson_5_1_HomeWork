import java.util.Scanner;

public class sumaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your digit (more than 0): ");
        double Num = in.nextDouble();
        int Sum = 0;
        for (int i = 1; i <= Num; i++) {
            Sum += i;
        }
        System.out.println("Sum = " + Sum);
    }
}
