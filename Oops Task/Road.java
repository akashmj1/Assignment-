
class Vehicle{
	    private String make;
	    private String model;
	    private int year;

	    public Vehicle(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void start() {
	        System.out.println("Vehicle is starting.");
	    }

	    public void stop() {
	        System.out.println("Vehicle is stopping.");
	    }

	    public void displayInfo() {
	        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	    }
}
class Truck extends Vehicle{
	 private double loadCapacity;

	    public Truck(String make, String model, int year, double loadCapacity) {
	        super(make, model, year);
	        this.loadCapacity = loadCapacity;
	    }

	    public double getLoadCapacity() {
	        return loadCapacity;
	    }

	    public void loadCargo() {
	        System.out.println("Loading cargo. Capacity: " + loadCapacity + " tons.");
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Load Capacity: " + loadCapacity + " tons");
	    }
}
class Bus extends Vehicle{
	private int passengerCapacity;

    public Bus(String make, String model, int year, int passengerCapacity) {
        super(make, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void boardPassengers() {
        System.out.println("Boarding passengers. Capacity: " + passengerCapacity + " people.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger Capacity: " + passengerCapacity + " people");
    }
}
class  Car extends Vehicle{
	private String bodyStyle;

    public Car(String make, String model, int year, String bodyStyle) {
        super(make, model, year);
        this.bodyStyle = bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void drive() {
        System.out.println("Driving a " + bodyStyle + " car.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Body Style: " + bodyStyle);
    }
}

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("Volvo", "FH16", 2020, 25);
        Bus bus = new Bus("Mercedes", "Sprinter", 2019, 50);
        Car car = new Car("Tesla", "Model S", 2021, "Sedan");

        truck.displayInfo();
        truck.start();
        truck.loadCargo();
        truck.stop();

        System.out.println();

        bus.displayInfo();
        bus.start();
        bus.boardPassengers();
        bus.stop();

        System.out.println();

        car.displayInfo();
        car.start();
        car.drive();
        car.stop();

	}

}
