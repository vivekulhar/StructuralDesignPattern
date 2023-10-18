package dev.vivek.decorator.PizzaDecorator;

public class MargheritaPizza implements Pizza{
    @Override
    public int getCost() {
        return 599;
    }

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }
}
