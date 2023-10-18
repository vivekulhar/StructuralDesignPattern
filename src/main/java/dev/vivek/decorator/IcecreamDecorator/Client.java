package dev.vivek.decorator.IcecreamDecorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoChips(
                new StrawberryScoop(
                new ChocoChips(
                new ChocolateCone(
                new OrangeCone()))));
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
