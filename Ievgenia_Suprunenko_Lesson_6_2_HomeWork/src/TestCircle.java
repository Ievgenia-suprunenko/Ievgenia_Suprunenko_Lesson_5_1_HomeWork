import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many objects should be created? ");
        int count = in.nextInt();

        for (int i = 0; i<count; i++){
            Circle circle = new Circle();
        }
        System.out.println(Circle.counter + " instanses were created");
    }
}
