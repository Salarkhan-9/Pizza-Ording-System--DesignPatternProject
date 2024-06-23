package Singleton;
import Builder.Pizza;

// Singleton class
public class OrderManager {
    private static OrderManager instance;

    private OrderManager() { /* private constructor */ }

    public static synchronized OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void processOrder(Pizza pizza) { /* process order logic */ }
}
