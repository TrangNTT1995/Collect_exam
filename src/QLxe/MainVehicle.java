package QLxe;

public class MainVehicle {
    public static void main(String[] args) {
        Bike bike = new Bike("Bike",10000);
        System.out.println("Tax of bike: " + bike.getTax());
        Motorbike motorbike = new Motorbike("Motorbike",21000000);
        System.out.println("Tax of motorbike: " + motorbike.getTax());
        Truck truck = new Truck("Truck",100000000);
        System.out.println("Tax of truck: " + truck.getTax());
        Car car = new Car("Car",500000000, 3);
        System.out.println("Tax of car: " + car.getTax());

    }
}
