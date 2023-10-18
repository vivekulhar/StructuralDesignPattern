package dev.vivek.decorator.BeverageDecorator;

public class BeverageDecorator implements Beverage{
    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

}
