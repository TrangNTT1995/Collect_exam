package policemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement();
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleManagement.dataVehicle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select type: 1- Add vehicle, 2- Find vehicle, 3- Find by CMND, 4- Remove vehicle, 5- The most vehicle of producer, 6- Sort vehicle, 7 - Statistic vehicle ");
        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    vehicleManagement.addVehicle();
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Input your vehicle number you wanna to find");
                    String vehicleByNumber = scanner2.next();
                    vehicleManagement.findVehicleByNumber(vehicleByNumber);
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Input CMND to find vehicle");
                    String cmnd = scanner3.next();
                    vehicleManagement.findVehicleByCMND(cmnd);
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Input the producer you wanna to remove");
                    String producer = scanner4.next();
                    vehicleManagement.removeVehicle(producer);
                    break;
                case 5:
                    vehicleManagement.mostVehiclesProducer();
                    break;
                case 6:
                    vehicleManagement.sortVehicleDESC();
                    break;
                case 7:
                    vehicleManagement.statisticVehicle();
                    break;
            }
        }
    }




