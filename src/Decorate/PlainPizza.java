package Decorate;

// Concrete component
public class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain Pizza";
    }

    public double cost() {
        return 5.00; // Assuming a plain pizza costs $5.00
    }
}
