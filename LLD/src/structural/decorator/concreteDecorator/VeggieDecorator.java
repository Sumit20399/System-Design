package structural.decorator.concreteDecorator;

import structural.decorator.componentInterface.Pizza;
import structural.decorator.decorator.PizzaDecorator;

public class VeggieDecorator extends PizzaDecorator {
    public VeggieDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Veggies";
    }

    @Override
    public double getCost() {
        return super.getCost() + 30.0; // Adding veggies cost
    }
}

