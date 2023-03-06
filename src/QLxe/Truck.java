package QLxe;

public class Truck extends Vehicle{


    public Truck(String type, double price) {
        super("Truck", price);
    }

    @Override
    public double getTax() {
        return getPrice()*0.1 + getPrice()*0.02;
    }
}
