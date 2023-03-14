package policemanagement;

import java.util.*;
import java.util.stream.Collectors;

public class VehicleManagement {
    Car car = new Car();
    Truck truck = new Truck();
    Motorbike motorbike = new Motorbike();
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public void dataVehicle(){
        Car car1 = new Car("31243", "Honda", 2020, "Red", new Owner("12345", "Nguyen Van A", "nguyen.van.a@gmail.com"), 4, "2 thi");
        vehicleList.add(car1);

        Motorbike motorbike1 = new Motorbike("23455", "Yamaha", 2021, "Blue", new Owner("6576546", "Tran Van B", "tran.van.b@gmail.com"), 100);
        vehicleList.add(motorbike1);

        Truck truck1 = new Truck("87685", "Toyota", 2017, "White", new Owner("32432", "Vo Thi C", "vo.thi.c@gmail.com"), 5000);
        vehicleList.add(truck1);

        Car car2 = new Car("12345", "Suzuki", 2022, "Green", new Owner("12432", "Nguyen Van B", "nguyen.van.b@gmail.com"), 7, "4 thi");
        vehicleList.add(car2);

        Motorbike motorbike2 = new Motorbike("2345325", "Honda", 2019, "Yellow", new Owner("657632546", "Hoang Van E", "hoang.van.e@gmail.com"), 200);
        vehicleList.add(motorbike2);

        Truck truck2 = new Truck("87685", "Toyota", 2023, "Black", new Owner("32432432", "Ho Thi My Lan", "ho.thi.my.lan@gmail.com"), 6000);
        vehicleList.add(truck2);
  }

    public void addVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your type: 1-policemanagement.Car, 2-policemanagement.Truck, 3-policemanagement.Motorbike: ");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Input number seat");
                int numberSeat = scanner1.nextInt();

                System.out.println("Input manufacturer:");
                String manufacturer = scanner1.next();

                System.out.print("Input number vehicle: ");
                String numberVehicle = scanner1.next();

                System.out.print("Input producer: ");
                String producer = scanner1.next();

                System.out.print("Input year: ");
                int year = scanner1.nextInt();
                scanner1.next();

                System.out.print("Input color: ");
                String color = scanner1.next();

                System.out.print("Input CMND: ");
                String CMND = scanner1.next();

                System.out.print("Input name: ");
                String name = scanner1.next();

                System.out.print("Email: ");
                String email = scanner1.next();
                
                Car car = new Car(numberVehicle, producer, year, color,  new Owner(CMND, name, email),
                        numberSeat, manufacturer);
              if(car.isValidVehicle()){
                  vehicleList.add(car);
                  System.out.println("Data has input is:" + vehicleList);
                  for(Vehicle vehicle : vehicleList) {
                      System.out.println(car.getNumberSeat() + "," + car.getManufacturer() + "," +
                              vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                              + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
                  }
                }else {
                    System.out.println("Error data");
                }
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Input Tonnage");
                int tonnage = scanner2.nextInt();

                System.out.print("Input number vehicle: ");
                String numberVehicleTruck = scanner2.next();

                System.out.print("Input producer: ");
                String producerTruck = scanner2.next();

                System.out.print("Input year: ");
                int yearTruck = scanner2.nextInt();

                System.out.print("Input color: ");
                String colorTruck = scanner2.next();

                System.out.print("Input CMND: ");
                String CMNDTruck = scanner2.next();

                System.out.print("Input name: ");
                String nameTruck = scanner2.next();

                System.out.print("Email: ");
                String emailTruck = scanner2.next();

                Truck truck = new Truck(numberVehicleTruck, producerTruck, yearTruck, colorTruck,  new Owner(CMNDTruck, nameTruck, emailTruck),
                        tonnage);
                if(truck.isValidVehicle()){
                    vehicleList.add(truck);
                    System.out.println("Data has input is:" + vehicleList);
                    for(Vehicle vehicle : vehicleList) {
                        System.out.println(truck.getTonnage()  + "," +
                                vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                                + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
                    }


                }else {
                    System.out.println("Error data");
                }
                break;

            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Input Cubicmeter");
                int cubicMeter = scanner3.nextInt();

                System.out.print("Input number vehicle: ");
                String numberVehicleMotor = scanner3.next();

                System.out.print("Input producer: ");
                String producerMotor = scanner3.next();

                System.out.print("Input year: ");
                int yearMotor = scanner3.nextInt();

                System.out.print("Input color: ");
                String colorMotor = scanner3.next();

                System.out.print("Input CMND: ");
                String CMNDMotor = scanner3.next();

                System.out.print("Input name: ");
                String nameMotor = scanner3.next();

                System.out.print("Email: ");
                String emailMotor = scanner3.next();
                Motorbike motorbike = new Motorbike(numberVehicleMotor, producerMotor, yearMotor, colorMotor,  new Owner(CMNDMotor, nameMotor, emailMotor),
                        cubicMeter);
                if(motorbike.isValidVehicle()){
                    vehicleList.add(motorbike);
                    for(Vehicle vehicle : vehicleList) {
                        System.out.println(motorbike.getCubicMeter()  + "," +
                                vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                                + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
                    }


                } else {
                    System.out.println("Error data");
                }
                break;
        }
    }

    public void findVehicleByNumber(String numberVehicle){
        ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>) vehicleList.stream().filter(
                vehicle -> Objects.equals(vehicle.getNumberVehicle(), numberVehicle)).collect(Collectors.toList());
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                    + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
        }
    }

    public void removeVehicle(String producer){
        this.vehicleList.removeIf(vehicle -> vehicle.getProducer().equals(producer));
        for(Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                    + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
        }
    }
    public void findVehicleByCMND(String cmnd){
        ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>) vehicleList.stream().filter(
                vehicle -> Objects.equals(vehicle.getOwner().getCMND(), cmnd)).collect(Collectors.toList());
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                    + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
        }
    }
    public void mostVehiclesProducer() {
        Hashtable<String, Integer> hashMap = new Hashtable<String, Integer>();
        hashMap.put("Honda", 0);
        hashMap.put("Suzuki", 0);
        hashMap.put("Toyota", 0);
        hashMap.put("Yamaha", 0);
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getProducer() == "Honda") {
                hashMap.put("Honda", hashMap.get("Honda") + 1);
            } else if (vehicle.getProducer() == "Suzuki") {
                hashMap.put("Suzuki", hashMap.get("Suzuki") + 1);
            } else if (vehicle.getProducer() == "Toyota") {
                hashMap.put("Toyota", hashMap.get("Toyota") + 1);
            } else {
                hashMap.put("Yamaha", hashMap.get("Yamaha") + 1);
            }
        }
        String mostVehiclesProducer = "";
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                mostVehiclesProducer = entry.getKey();
            }
        }
        System.out.println("The most vehicles producer is " + mostVehiclesProducer);
    }
    public void sortVehicleDESC(){
        Collections.sort(vehicleList, Comparator.comparing(Vehicle::getNumberVehicle).reversed());
        for(Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getProducer() + ","  + vehicle.getNumberVehicle() + ","
                    + vehicle.getColor() + ","  + vehicle.getOwner().getName() + ","  + vehicle.getOwner().getCMND() + ","  + vehicle.getOwner().getEmail());
        }


    }
    public void statisticVehicle(){
        Hashtable<String, Integer> hashMap = new Hashtable<String, Integer>();
        hashMap.put("policemanagement.Car", 0);
        hashMap.put("policemanagement.Truck", 0);
        hashMap.put("policemanagement.Motorbike", 0);
        for (Vehicle vehicle : vehicleList) {
            if (vehicle instanceof Car) {
                hashMap.put("policemanagement.Car", hashMap.get("policemanagement.Car") + 1);
            } else if (vehicle instanceof Motorbike) {
                hashMap.put("Motobike", hashMap.get("policemanagement.Motorbike") + 1);
            } else {
                hashMap.put("policemanagement.Truck", hashMap.get("policemanagement.Truck") + 1);
            }
        }
        System.out.println("List quantity of vehicles by type: " + hashMap);
    }
    }



