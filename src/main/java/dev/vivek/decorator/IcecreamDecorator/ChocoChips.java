package dev.vivek.decorator.IcecreamDecorator;

public class ChocoChips implements IceCream{
    private IceCream iceCream;

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 5;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + ChocoChips";
    }
}
