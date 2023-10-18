package dev.vivek.decorator.BeverageDecorator;

public class CaramelDecorator extends BeverageDecorator{
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Caramel";
    }
}
