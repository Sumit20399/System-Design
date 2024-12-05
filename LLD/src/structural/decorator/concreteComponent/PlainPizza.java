package structural.decorator.concreteComponent;

import structural.decorator.componentInterface.Pizza;

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 200.0; // Base cost of plain pizza
    }
}
