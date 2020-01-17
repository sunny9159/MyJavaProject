package MyFirstPackage;

public class Restaurant {

    /**
     * Create a restaurant class with attribute name, guestCapacity, guestCount
     * 1. Create a method that tells user if the seats are available
     * 2. Create a method that seatsParty
     * 3. Create a method that removesParty
     * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
     * 5. Create a method that printsRestaurantSummary
     */

    private String name;
    private int guestCapacity;
    private int guestCount;

    public void printSummary() {
        System.out.println("Name : " + this.name);
        System.out.println("Guest Capacity : " + this.guestCapacity);
        System.out.println("Guest Count : " + this.guestCount);
    }

    public boolean isSeatAvailable(int incomingGuest) {
        int currentCount = guestCapacity - guestCount;
        return currentCount > incomingGuest;
    }

    public void setDetails(String name, int guestCapacity) {
        this.name = name;
        this.guestCapacity = guestCapacity;
    }

    public void seatsParty(int guestCount) {

        this.guestCount += guestCount ;
    }

    public void removesParty(int guestCount) {

        this.guestCount -= guestCount;
    }

    public void resetCapacity() {
        guestCapacity = 0;
        guestCount = 0;
    }

}

