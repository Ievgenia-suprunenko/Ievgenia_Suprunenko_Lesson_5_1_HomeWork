import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your weight: ");
        double Weight = in.nextDouble();
        System.out.println("Enter your hight: ");
        double Hight = in.nextDouble();
        double BMI = Weight / (Hight * Hight);
        System.out.println(BMI);
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("Normal");
        } else if (BMI >= 25.0 && BMI < 30.0) {
            System.out.println("Overweight");
        } else if (BMI >= 30.0) {
            System.out.println("Obese");
        }
    }
}
