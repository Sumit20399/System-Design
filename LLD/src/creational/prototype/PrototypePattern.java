package creational.prototype;

public class PrototypePattern {
    public static void main(String[] args) {
        // Create an original circle
        Circle originalCircle = new Circle(10);
        originalCircle.draw();

        // Clone the circle
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.draw();

        // Create an original rectangle
        Rectangle originalRectangle = new Rectangle(20, 15);
        originalRectangle.draw();

        // Clone the rectangle
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.draw();
    }
}

