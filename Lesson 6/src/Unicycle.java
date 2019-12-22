public class Unicycle extends Cycle{
    Cycle Q = new Unicycle();

    public Unicycle(String round, Cycle q) {
        super(round);
        Q = q;
    }
}
