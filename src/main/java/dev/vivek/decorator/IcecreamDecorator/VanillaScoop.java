package dev.vivek.decorator.IcecreamDecorator;

public class VanillaScoop implements IceCream {
       private IceCream iceCream;

        public VanillaScoop(IceCream iceCream) {
            this.iceCream = iceCream;
        }

        @Override
        public int getCost() {
            return iceCream.getCost() + 5;
        }

        @Override
        public String getDescription() {
            return iceCream.getDescription() + " + Vanilla Scoop";
        }
}
