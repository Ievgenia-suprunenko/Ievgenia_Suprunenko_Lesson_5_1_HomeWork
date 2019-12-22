public class sumaDigits {
    public static void main(String[] args) {
        int Sum = 0;
        for (int i = 1; i <= 20; i++) {
            Sum += i;
        }
        if (Sum <= 50) {
            System.out.println("Sum is " + Sum);
        } else {
            System.out.println("Summa is more than 50");
        }
    }
}
