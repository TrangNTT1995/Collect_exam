package policemanagement;

public class Truck extends Vehicle{
    private int tonnage;
    public Truck(String numberVehicle, String producer, int year, String color, Owner owner, int trongTai) {
        super(numberVehicle, producer, year, color, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck() {
    }
}

