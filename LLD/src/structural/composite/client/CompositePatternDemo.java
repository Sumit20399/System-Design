package structural.composite.client;

import structural.composite.component.Employee;
import structural.composite.composite.Department;
import structural.composite.leaf.Developer;
import structural.composite.leaf.Manager;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Individual employees
        Employee dev1 = new Developer("Alice", "Backend Developer");
        Employee dev2 = new Developer("Bob", "Frontend Developer");
        Employee manager1 = new Manager("Charlie", "Project Manager");

        // Composite: IT Department
        Department itDepartment = new Department("IT Department");
        itDepartment.addEmployee(dev1);
        itDepartment.addEmployee(dev2);
        itDepartment.addEmployee(manager1);

        // Individual employee
        Employee hrManager = new Manager("Diana", "HR Manager");

        // Composite: HR Department
        Department hrDepartment = new Department("HR Department");
        hrDepartment.addEmployee(hrManager);

        // Composite: Company
        Department company = new Department("Company");
        company.addEmployee(itDepartment);
        company.addEmployee(hrDepartment);

        // Display details
        company.showDetails();
    }
}
