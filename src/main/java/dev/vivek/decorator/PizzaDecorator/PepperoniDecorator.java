package dev.vivek.decorator.PizzaDecorator;

public class PepperoniDecorator extends PizzaDecorator{
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost()+100;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Pepperoni";
    }
}
