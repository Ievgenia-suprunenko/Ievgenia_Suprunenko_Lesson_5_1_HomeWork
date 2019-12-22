import java.util.Scanner;

public class HT3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        Integer number = in.nextInt();
        Double a[] = new Double[number];
        System.out.println("Enter the numbers: ");

        double sum = 0;
        int over = 0;
        double avarage;
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
            sum = sum + a[i];
        }
        avarage = sum / a.length;
        System.out.println("Avarage" + avarage);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > avarage) {
                over++;
            }
        }
        System.out.println("Over" + over);
    }
}