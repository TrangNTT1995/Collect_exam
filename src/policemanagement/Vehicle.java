package policemanagement;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Vehicle {
    private String numberVehicle;
    private String producer;
    private static int year;
    private String color;
    private Owner owner;
    private static ArrayList<String> numberList = new ArrayList<>();
    private static ArrayList<String> producers = new ArrayList<>(
            Arrays.asList("Honda", "Yamaha", "Toyota", "Suzuki"));

   public Vehicle(String numberVehicle,String producer,int year,String color,Owner owner){
       this.numberVehicle = numberVehicle;
       this.producer = producer;
       this.year = year;
       this.color = color;
       this.owner = owner;
   }

    public Vehicle() {

    }

    public String getNumberVehicle() {
        return numberVehicle;
    }

    public void setNumberVehicle(String numberVehicle) {
        this.numberVehicle = numberVehicle;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Vehicle.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
/*    public void displayInfo() {
        System.out.println("==policemanagement.Vehicle info:==");
        System.out.println("Number: " + this.numberVehicle);
        System.out.println("Producer: " + this.producer);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        this.policemanagement.Owner.displayInfo();*/
  //  }
    public boolean isValidProducer(){
        if (producers.contains(producer)){
            return true;
        }
        return false;
    }
    public boolean isValidYear(){
        if (year>2023 || year <2000){
            return false;
        }
        return true;
    }
    public boolean isUniqueNumberVehicle(){
        if(numberVehicle.length() == 5 && !numberList.contains(numberVehicle)){
            return true;
        }
        return false;
    }
    public boolean isValidVehicle(){
        if (isValidProducer() && isUniqueNumberVehicle() && isValidYear()){
            return true;
        }
        return false;
    }
}
