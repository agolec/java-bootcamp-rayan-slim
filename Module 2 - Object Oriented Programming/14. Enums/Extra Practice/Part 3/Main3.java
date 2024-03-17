import model.CarDealership;
import model.EnumPt3ModelCar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        EnumPt3ModelCar.BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);


        EnumPt3ModelCar newCar = new EnumPt3ModelCar(make, model, bodyType, year, price);


        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);


        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());



    }
    public static boolean isNullOrBlank(String input){
        if(input == null || input.isBlank()){
            return true;
        }
        return false;
    }
    public static boolean invalidYear(int year){
        if(year < EnumPt3ModelCar.MIN_YEAR){
            return true;
        }
        return false;
    }
    public static boolean invalidPrice(double input){
        if(input < EnumPt3ModelCar.MIN_PRICE || input > EnumPt3ModelCar.MAX_PRICE){
            return true;
        }
        return false;
    }
    public static boolean invalidBodyType(String input){
        try{
            EnumPt3ModelCar.BodyType.valueOf(input.toUpperCase());
            return false;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return true;
        }
    }
    public static EnumPt3ModelCar.BodyType promptForBodyType(Scanner scanner){
        while(true){
            System.out.println("\nEnter a valid body type: ");
            String bodyType = scanner.nextLine();
            if(!invalidBodyType(bodyType)){
                return EnumPt3ModelCar.BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }
    public static String promptForMake(Scanner scanner){
        while(true){
            System.out.println("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if(!isNullOrBlank(make)){
                return make;
            }
        }
    }
    public static String promptForModel(Scanner scanner){
        while(true){
            System.out.println("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if(!isNullOrBlank(model)){
                return model;
            }
        }
    }
    public static int promptForYear(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid car Year: ");
            if(!scanner.hasNextInt()){
                scanner.next();
                continue;
            }
            int year = scanner.nextInt();
            if(!invalidYear(year)){
                return year;
            }
        }
    }
    public static double promptForPrice(Scanner scanner){
        while(true){
            System.out.println("\n please enter a valid car price: ");
            if(!scanner.hasNextDouble()) {
                scanner.next();
                continue;
            }
            double price = scanner.nextDouble();
            if(!invalidPrice(price)){
                return price;
            }
        }
    }
}