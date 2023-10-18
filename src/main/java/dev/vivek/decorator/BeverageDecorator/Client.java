package dev.vivek.decorator.BeverageDecorator;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("Ordering an espresso");
        System.out.println(beverage.getDescription() + " " + beverage.getCost());
        System.out.println("Adding milk to the espresso");

        Beverage milkBeverage = new MilkDecorator(beverage);
        System.out.println(milkBeverage.getDescription() + " " + milkBeverage.getCost());
        System.out.println("Adding milk and caramel to the espresso");
        Beverage caramelBeverage = new CaramelDecorator(milkBeverage);
        System.out.println(caramelBeverage.getDescription() + " " + caramelBeverage.getCost());

    }
}
