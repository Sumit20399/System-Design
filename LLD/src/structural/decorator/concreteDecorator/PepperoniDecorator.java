package structural.decorator.concreteDecorator;

import structural.decorator.componentInterface.Pizza;
import structural.decorator.decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 70.0; // Adding pepperoni cost
    }
}
