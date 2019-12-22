import java.util.Scanner;

public class HT2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter month name: ");
        String name = in.nextLine();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int monthNum = 0;
        for (int i = 0; i < months.length; i++) {
            if (name.equals(months[i])) {
                monthNum = i + 1;
            }
        }
        {
            System.out.println("The month number is " + monthNum);
        }
    }
}