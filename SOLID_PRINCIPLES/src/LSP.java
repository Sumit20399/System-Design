public class LSP {
    /*

    Subtypes must be substitutable for their base types without altering the correctness of the program.
    In other words, derived classes should be replaceable by their base classes.

    class Bird {
        public void fly() {
            System.out.println("Flying");
        }
    }

    class Sparrow extends Bird {
        // Inherits fly behavior correctly
    }

    class Penguin extends Bird {
        // Penguins cannot fly
        @Override
        public void fly() {
            throw new UnsupportedOperationException("Penguins cannot fly");
        }
    }

    Here, Penguin violates the Liskov Substitution Principle because it cannot be
    substituted for Bird without breaking the program.
    A better design would separate flying birds and non-flying birds:

     */
}

abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void move() {
        fly();
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Walking on the ground");
    }
}



