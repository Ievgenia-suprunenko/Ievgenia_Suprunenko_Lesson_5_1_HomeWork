public class task3Boolean {
    public static void main(String[] args) {
//        int x = 1;
//        ( true ) && (3 > 4); True and False = False;
//        !(x > 0) && (x > 0); False and True = False;
//        (x > 0) || (x < 0); True or False = True;
//        (x != 0) || (x == 0); True or False = True;
//        (x >= 0) || (x < 0); True or False = True;
//        (x != 1 ) == !(x == 1) False = False = False;

        int x = 45;
        int y = 67;
        int z = 101;
        boolean first = (x >= 50) && (x <= 100);
        boolean second = (y >= 50) && (y <= 100);
        boolean third = (z >= 50) && (z <= 100);
        System.out.println("x " + first);
        System.out.println("y " + second);
        System.out.println("z " + third);
    }
}
