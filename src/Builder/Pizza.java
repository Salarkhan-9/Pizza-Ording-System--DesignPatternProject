package Builder;

import java.util.ArrayList;
import java.util.List;

// Product
public class Pizza implements Decorate.Pizza {
    private String size;
    private String crust;
    private List<String> toppings;

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return 0;
    }

    // Builder
    public static class Builder {
        private String size;
        private String crust;
        private java.util.List<String> toppings = new ArrayList<String>();

        public Builder size(String size) { /* set size */
            return null;
        }
        public Builder crust(String crust) { /* set crust */
            return null;
        }
        public Builder addTopping(String topping) { /* add topping */
            return null;
        }
        public Pizza build() { /* return Pizza instance */
            return null;
        }
    }

    private Pizza(Builder builder) { /* initialize Pizza with builder values */ }
}
