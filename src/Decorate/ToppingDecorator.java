package Decorate;

// Decorator
abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) { /* set pizza */ }
    public String getDescription() { /* get description from pizza */
        return "";
    }
    public double cost() { /* get cost from pizza */
        return 0;
    }
}