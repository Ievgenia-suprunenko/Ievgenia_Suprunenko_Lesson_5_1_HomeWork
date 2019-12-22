public class HT1 {
    private int maxElement;

    public static void main(String[] args) {
        int[] myList = {12, 54, 3, 76, 100, 34, 54, 6, 124};
        {
            int maxElement = myList[0];
            for (int i = 0; i < myList.length; i++) {
                if (maxElement < myList[i]) {
                    maxElement = myList[i];
                }
            }
                System.out.println("Max element is " + maxElement);
        }
        {
            int minElement = myList[0];
            for (int i = 0; i < myList.length; i++) {
                if (minElement > myList[i]) {
                    minElement = myList[i];
                }
            }
                System.out.println("Min element is " + minElement);
        }
        {
            int serZnach = ((myList[0] + myList[1] + myList[2] + myList[3] + myList[4] + myList[5] + myList[6] + myList[7] + myList[8]) / 9);
            System.out.println("Average value is " + serZnach);
        }
        {
            int maxElement = myList[0];
            int indeksMaxElement = 0;
            for (int i = 0; i < myList.length; i++) {
                if (maxElement < myList[i]) {
                    maxElement = myList[i];
                    indeksMaxElement = i;
                }
            }
                System.out.println("MAX elemt index is " + indeksMaxElement);
        }
        {
            int firstElement = myList[8];
            int lastElement = myList[0];
            System.out.println("New array is " + ("{ " + firstElement + ", " + myList[1] + ", " + myList[2] + ", " + myList[3] + ", " + myList[4] + ", " + myList[5] + ", " + myList[6] + ", " + myList[7] + ", " + lastElement + " }"));
        }
    }
}