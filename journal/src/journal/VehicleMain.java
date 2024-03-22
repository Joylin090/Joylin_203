package journal;
//Joylin D'Cunha RollNo: 203

class Vehicle {
    protected int horsepower;

    // Constructor with horsepower parameter
    public Vehicle(int horsepower) {
        this.horsepower = horsepower;
    }

    public void drive() {
        System.out.println("Vehicle is driving with " + horsepower + " horsepower.");
    }
}

class Car extends Vehicle {
    private int horsepower = 90; // overriding the horsepower attribute for Car
    private String make;

    // Constructor that calls the Vehicle class constructor and sets the make for Car
    public Car(String make) {
        super(60); // calling Vehicle's constructor
        this.make = make;
    }

    // Overriding the drive() method
    @Override
    public void drive() {
        super.drive(); // calling the parent drive method
        System.out.println("Car of make " + make + " is driving with " + horsepower + " horsepower.");
    }
}
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Toyota");
        myCar.drive();

	}

}
