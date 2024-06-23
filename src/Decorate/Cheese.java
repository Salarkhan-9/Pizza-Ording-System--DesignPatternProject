package Decorate;

// Concrete decorators
public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return pizza.cost() + 1.00; // Assuming cheese costs $1.00
    }
}
