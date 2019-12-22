public class Rectangle {
    double width;
    double length;
    
    Rectangle(double newWidth, double newLenght) {
        width = newWidth;
        length = newLenght;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    double getArea() {
        return width * length;
    }

    void prtintMyRectanglePerimetr() {
        System.out.println("Rectangle perimetr is " + getPerimeter());
    }

    void prtintMyRectangleArea() {
        System.out.println("Rectangle area is " + getArea());
    }
}
