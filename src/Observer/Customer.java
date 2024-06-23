package Observer;

// Concrete Observer
public class Customer implements Observer {
    private String name;
    public Customer(String name) { /* set name */ }
    public void update(String status) { /* update customer with status */ }
}
