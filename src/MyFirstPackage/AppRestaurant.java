package MyFirstPackage;

import javax.naming.Name;

public class AppRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.setDetails("Dominos", 30);

        restaurant.seatsParty(25);

        restaurant.removesParty(6);

        restaurant.printSummary();



    }
}
