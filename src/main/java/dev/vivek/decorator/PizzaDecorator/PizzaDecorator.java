package dev.vivek.decorator.PizzaDecorator;

public class PizzaDecorator implements Pizza{
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+10;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" + Pizza Base";
    }
}
