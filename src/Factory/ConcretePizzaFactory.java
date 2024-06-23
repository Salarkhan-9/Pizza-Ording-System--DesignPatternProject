package Factory;

// Concrete factory
public class ConcretePizzaFactory implements PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("Veggie")) return new VeggiePizza();
        else if (type.equals("Pepperoni")) return new PepperoniPizza();
        else return null;
    }
}
