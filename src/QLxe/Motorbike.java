package QLxe;

public class Motorbike extends Vehicle{
    public Motorbike(String type, double price) {
        super("Motorbike", price);
    }

    @Override
    public double getTax() {
        return getPrice()*0.1 + getPrice()*0.05;
    }
}
