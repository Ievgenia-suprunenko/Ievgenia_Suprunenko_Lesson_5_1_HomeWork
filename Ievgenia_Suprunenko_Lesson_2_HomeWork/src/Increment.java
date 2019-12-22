public class Increment {
    public static void main(String[] args) {
        int a = 6;
//        postfix increment: first, the value of the "a" is assigned to the "b", and then the value of the "aМгкфя" is increased by 1
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
