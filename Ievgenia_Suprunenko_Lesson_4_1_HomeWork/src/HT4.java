import java.awt.*;
import java.util.Arrays;

public class HT4 {
//    double [] myList = {1.2, 3, 4.4, 3.5, 5};
//
//    void sort(double num[]) {
//       double l = num.length;
//       double temp = 0;
//        List list = new List();
//        list.sort(myList);

    public static void main(String[] args) {
        Integer[] myList = {3, 4, 5, 3, 3, 5, 2, 2, 1, 9, 2};

        for (int i = myList.length - 1; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                if (myList[a] > myList[a + 1]) {
                    int tmp = myList[a];
                    myList[a] = myList[a + 1];
                    myList[a + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(myList));
    }
}