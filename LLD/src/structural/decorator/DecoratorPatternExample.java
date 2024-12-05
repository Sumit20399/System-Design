package structural.decorator;

import structural.decorator.componentInterface.Pizza;
import structural.decorator.concreteComponent.PlainPizza;
import structural.decorator.concreteDecorator.CheeseDecorator;
import structural.decorator.concreteDecorator.PepperoniDecorator;
import structural.decorator.concreteDecorator.VeggieDecorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Base pizza
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.getDescription() + " Cost: " + plainPizza.getCost());

        // Adding Cheese
        Pizza cheesePizza = new CheeseDecorator(plainPizza);
        System.out.println(cheesePizza.getDescription() + " Cost: " + cheesePizza.getCost());

        // Adding Veggies to Cheese Pizza
        Pizza veggieCheesePizza = new VeggieDecorator(cheesePizza);
        System.out.println(veggieCheesePizza.getDescription() + " Cost: " + veggieCheesePizza.getCost());

        // Adding Pepperoni to Veggie Cheese Pizza
        Pizza deluxePizza = new PepperoniDecorator(veggieCheesePizza);
        System.out.println(deluxePizza.getDescription() + " Cost: " + deluxePizza.getCost());
    }
}
