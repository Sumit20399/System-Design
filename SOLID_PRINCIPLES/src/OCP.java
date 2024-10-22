public class OCP {
    /*
    Software entities (classes, modules, functions, etc.)
    should be open for extension but closed for modification.
    This means you should be able to add new functionality without changing existing code.

    In this example, the Shape class is open for extension (new shapes like Triangle can be added)
    but closed for modification (you don't need to change the existing Circle or Rectangle classes
    to add new shapes).

     */
}

// Base class
abstract class Shape {
    public abstract double area();
}

// Derived classes extend behavior
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

