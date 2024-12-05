package structural.decorator.concreteDecorator;

import structural.decorator.componentInterface.Pizza;
import structural.decorator.decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0; // Adding cheese cost
    }
}
