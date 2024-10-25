package creational.prototype;

public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}


class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Implement the clone method
    @Override
    public Shape clone() {
        return new Circle(this.radius); // Creates a new instance with the same properties
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the clone method
    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height); // Creates a new instance with the same properties
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
}
