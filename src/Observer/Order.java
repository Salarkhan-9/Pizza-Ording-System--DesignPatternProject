package Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void registerObserver(Observer o) { /* add observer */ }
    public void removeObserver(Observer o) { /* remove observer */ }
    public void notifyObservers() { /* notify all observers */ }

    public void setStatus(String status) { /* set status and notify observers */ }
}

