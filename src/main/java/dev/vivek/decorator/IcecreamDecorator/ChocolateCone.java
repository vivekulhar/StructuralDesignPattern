package dev.vivek.decorator.IcecreamDecorator;

public class ChocolateCone implements IceCream{
    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 10;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate Cone";
    }
}
