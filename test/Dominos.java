package test;

public class Dominos {

    public static void main(String[] args) {
        Pizza imanisPizza = new Pizza();
        System.out.println("Type of pizza:" + imanisPizza.pizzaType);
        System.out.println("Size:" + imanisPizza.size);
        System.out.println("Quantity:" + imanisPizza.quantity);
        imanisPizza.totalPriceofPizza (imanisPizza.price, imanisPizza.quantity);

        // in order to call the method here, we need to call it same way it is defined. in our case method totalPriceofPizza has two parameters
        // so we need to call those parameters here as well, otherwise it will throw error


        // creating a new pizza object- marufs pizza

        // below I am assigning a new value to pizzatype for marufs pizza;

        Pizza marufsPizza = new Pizza();
        marufsPizza.pizzaType= "Thin Crust";
        System.out.println("Type of pizza:" + marufsPizza.pizzaType);
    }
}


