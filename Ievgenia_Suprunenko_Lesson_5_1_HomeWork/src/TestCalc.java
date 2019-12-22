public class TestCalc {
    public static void main(String[] args) {
        Calc firstCalc = new Calc(4, 2);
        System.out.println("Add two elements = " + firstCalc.plussNumbs());
        System.out.println("First element minus second element = " + firstCalc.minusNumbs());
        System.out.println("First element * second element = " + firstCalc.miltyNumbs());
        System.out.println("First element / second element = " + firstCalc.divNumbs());
    }
}
