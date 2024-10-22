public class ISP {
    /*

    Clients should not be forced to implement interfaces they don't use.
    Instead of one large interface, split it into smaller, more specific ones.

    In this example, Robot should not be forced to implement eat() because
    it doesn’t need to eat. The interface has been split into Workable and Eatable,
    adhering to the Interface Segregation Principle.

     */
}

// Bad example: a single large interface
interface Worker {
    void work();
    void eat();
}

// Segregated interface design
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Employee implements Workable, Eatable {
    public void work() {
        System.out.println("Working");
    }

    public void eat() {
        System.out.println("Eating");
    }
}

class Robot implements Workable {
    public void work() {
        System.out.println("Working");
    }
}

