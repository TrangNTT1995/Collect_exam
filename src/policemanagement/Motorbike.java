package policemanagement;

public class Motorbike extends Vehicle{
    private int cubicMeter;

    public Motorbike(String numberVehicle, String producer, int year, String color, Owner owner,int cubicMeter) {
        super(numberVehicle, producer, year, color, owner);
        this.cubicMeter= cubicMeter;
    }

    public Motorbike() {
    }

    public int getCubicMeter() {
        return cubicMeter;
    }

    public void setCubicMeter(int cubicMeter) {
        this.cubicMeter = cubicMeter;
    }
}
