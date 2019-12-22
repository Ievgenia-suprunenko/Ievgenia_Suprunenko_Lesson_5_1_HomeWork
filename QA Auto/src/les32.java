public class les32 {
    public static void main(String[] args) {
        int price = 10;
        String taxCountry = "U";
        switch (taxCountry) {
            case "Ukraine":
                System.out.println("Price = " + (price + 10));
                break;
            case "USA":
                System.out.println("Price = " + (price + 20));
                break;
            case "UK":
                System.out.println("Price = " + (price + 30));
                break;
            default:
                System.out.println("Price = " + price);
        }
    }
}
