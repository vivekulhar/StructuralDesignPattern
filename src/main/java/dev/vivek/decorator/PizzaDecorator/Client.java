package dev.vivek.decorator.PizzaDecorator;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        Pizza pizza1 = new PizzaDecorator(pizza);
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());

        Pizza cheesePizza = new CheesDecorator(pizza);
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getCost());

        Pizza pepperPizza = new PepperoniDecorator(pizza);
        System.out.println(pepperPizza.getDescription());
        System.out.println(pepperPizza.getCost());

        Pizza complexPizza = new PepperoniDecorator(
                new CheesDecorator(
                new PizzaDecorator(pizza)));
        /*pizza = new Barbeque(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        pizza = new Paneer(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());*/
    }
}
