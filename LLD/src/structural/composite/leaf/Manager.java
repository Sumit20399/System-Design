package structural.composite.leaf;

import structural.composite.component.Employee;

public class Manager implements Employee {
    private String name;
    private String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
    }
}
