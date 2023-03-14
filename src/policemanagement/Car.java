package policemanagement;

public class Car extends Vehicle {
    private int numberSeat;
    private String manufacturer;

    public Car(String numberVehicle, String producer, int year, String color, Owner owner, int numberSeat, String manufacturer) {
        super(numberVehicle, producer, year, color, owner);
        this.numberSeat = numberSeat;
        this.manufacturer = manufacturer;
    }

    public Car() {
        super();
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
