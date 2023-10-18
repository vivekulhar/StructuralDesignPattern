package dev.vivek.decorator.PizzaDecorator;

public class CheesDecorator extends PizzaDecorator{
    public CheesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return super.getCost()+50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + Cheese";
    }

}
