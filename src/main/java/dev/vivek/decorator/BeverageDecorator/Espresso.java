package dev.vivek.decorator.BeverageDecorator;

public class Espresso implements Beverage{
    @Override
    public int getCost() {
        return 199;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
