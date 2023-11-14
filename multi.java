import java.util.Scanner;

class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    String colour;

    public Car(String make, String model, String colour) {
        super(make, model);
        this.colour = colour;
    }




    public void displayDetails() {
        super.displayDetails();
        System.out.println("Colour of the car: " + colour);
    }
}

class Maruti extends Car {
    String variant;

    public Maruti(String make, String model, String colour, String variant) {
        super(make, model, colour);
        this.variant = variant;
    }

    // Additional Maruti-specific methods or properties can be added here

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Variant: " + variant);
    }
}

public class multi {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Maruti make: ");
        String marutiMake = scanner.nextLine();

        System.out.println("Enter Maruti model: ");
        String marutiModel = scanner.nextLine();

        System.out.println("Enter colour of   Maruti: ");
        String colr = scanner.nextLine();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Maruti variant: ");
        String marutiVariant = scanner.nextLine();
        Maruti marutiCar = new Maruti(marutiMake, marutiModel, colr, marutiVariant);


        marutiCar.start();
        marutiCar.displayDetails();
        marutiCar.stop();
    }
}
