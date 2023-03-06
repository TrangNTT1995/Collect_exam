package QLxe;

public class Bike extends Vehicle{
    public Bike(String type, double price) {
        super("Bike", price);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

