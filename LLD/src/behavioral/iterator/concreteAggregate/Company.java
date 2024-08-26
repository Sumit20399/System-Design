package behavioral.iterator.concreteAggregate;

import behavioral.iterator.aggregateInterface.Aggregate;
import behavioral.iterator.bean.Employee;
import behavioral.iterator.concreteIterator.EmployeeIterator;
import behavioral.iterator.iteratorInterface.Iterator;

import java.util.List;

public class Company implements Aggregate<Employee> {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
