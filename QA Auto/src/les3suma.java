public class les3suma {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 10; i <= 20; i++) {
            suma = suma + i;
            if (suma > 50){
                break;
            }
                System.out.println(suma);
        }
        System.out.println("Suma after loop:" + suma);
    }
}
