import java.util.Scanner;

public class sumaNumbers {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        int a = 1;
        int b = 2;
        System.out.print("What is " + a + " + " + b + " ? ");
        Scanner in = new Scanner(System.in);
        int Answer = in.nextInt();
        if (Answer == a + b) {
            System.out.println("You got it!");
        } else {
            System.out.println("Wrong answer. Try again");
            check();
        }
    }
}
//чесно признаюся) до вирішення цієї задачі я дійшла не сама, але розумію і можу пояснити