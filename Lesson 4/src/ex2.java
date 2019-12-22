public class ex2 {
    public static void main(String[] args) {
        int[] myList = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum = sum + myList[i];
        }
        System.out.println(sum);
    }
}
