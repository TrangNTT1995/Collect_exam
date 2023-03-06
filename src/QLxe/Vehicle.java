package QLxe;

public abstract class Vehicle {
    String type;
    double tax;
    double price;

    public Vehicle(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public double getTax(){
        return tax;
    }
    public String getType(){
        return type;
    }

    public double getPrice() {
        return price;
    }

}
