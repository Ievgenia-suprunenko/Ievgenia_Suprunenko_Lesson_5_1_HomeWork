import java.util.Scanner;

public class stolittya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter Year:");
        int Year = in.nextInt();
        int Century;
        Century = Year / 100 + 1;
        System.out.println("Its " + Century + " century");
    }
}
