package dev.vivek.decorator.IcecreamDecorator;

public class StrawberryScoop implements IceCream{
    private IceCream iceCream;

    public StrawberryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Scoop";
    }
}
