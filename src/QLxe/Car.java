package QLxe;

public class Car extends Vehicle{
    int seat;
    public Car(String type, double price, int seat) {
        super("Car", price);
        this.seat = seat;
    }

    @Override
    public double getTax() {
        if(seat>=5){
            return getPrice()*0.1 + getPrice()*0.2 + getPrice()*0.3;
        } else {
            return getPrice()*0.1 + getPrice()*0.2 + getPrice()*0.5;
        }

    }
}

