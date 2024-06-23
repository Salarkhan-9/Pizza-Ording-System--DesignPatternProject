import Builder.Pizza;
import Decorate.Cheese;
import Decorate.PlainPizza;
import Factory.ConcretePizzaFactory;
import Factory.PizzaFactory;
import Observer.Customer;
import Observer.Order;
import Observer.Observer;
import Singleton.OrderManager;

public class Main {
    public static void main(String[] args) {
        // Factory Method Pattern
        PizzaFactory pizzaFactory = new ConcretePizzaFactory();
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");

        // Builder Pattern
        Pizza pizza = new Pizza.Builder()
                .size("large")
                .crust("thin")
                .addTopping("cheese")
                .addTopping("mushrooms")
                .build();

        // Singleton Pattern
        OrderManager orderManager = OrderManager.getInstance();
        orderManager.processOrder(veggiePizza);

        // Decorator Pattern
        PlainPizza plainPizza = new PlainPizza();
        Cheese cheesePizza = new Cheese(plainPizza);


        // Observer Pattern
        Order order = new Order();
        Observer customer = new Customer("Alice");
        order.registerObserver(customer);
        order.setStatus("Preparing");
        order.notifyObservers(); // Notify observers of status change
    }
}
