public class TvConstr {
    public static void main(String[] args) {
        TV ourSonyTV = new TV();
        TV ourPanasonicTV = new TV(6, 30);
        ourPanasonicTV.volumeUp();

        System.out.println("Current tv volume level of our TV is: " + ourSonyTV.volumeLevel);
        System.out.println("Current tv volume level of our TV is: " + ourPanasonicTV.volumeLevel);
    }
}
