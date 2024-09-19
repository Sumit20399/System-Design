package behavioral.template.concreteClass;

import behavioral.template.abstractClass.BeverageMaker;

public class TeaMaker extends BeverageMaker {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
