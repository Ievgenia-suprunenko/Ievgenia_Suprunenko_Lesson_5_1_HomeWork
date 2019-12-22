public class Calc {
    double a;
    double b;

    Calc(double newA, double newB) {
        a = newA;
        b = newB;
    }

    double plussNumbs() {
        return a + b;
    }

    double minusNumbs() {
        return a - b;
    }

    double miltyNumbs() {
        return a * b;
    }

    double divNumbs() {
        return a / b;
    }
}
