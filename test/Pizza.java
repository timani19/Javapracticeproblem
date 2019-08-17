package test;

public class Pizza {
        // properties (state)

        String pizzaType= "Pan Pizza";
        double price=12.99;
        boolean isHaram=false;
        boolean isDelicious=true;
        char size = 'M';
        String toppings= "Mixed veggie";
        int quantity = 2;

        // methods (Behaviors)
        public void receivedOrder(char size, String toppings) {
            System.out.println("Received order:" + " " + size + "," + toppings);
        }

        public void totalPriceofPizza(double price, int quantity) {
            System.out.println("Total:" + price * quantity);
        }

    }


