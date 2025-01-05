
class Vehicle{
	public void move() {
		System.out.print("Vechicle is Moving......");
	}
}
class Truck extends Vehicle{
	@Override
	public void move()
	{
		System.out.println("Truck is Moving......");
	}
}
class Bus extends Vehicle{
	@Override
	public void move() {
		System.out.println("Bus is Moving....");
	}
}
class  Car extends Vehicle{
	@Override
	public void move() {
		System.out.println("Car is moving......");
	}
}

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck tr=new Truck();
		Bus bs= new Bus();
		Car cr =new Car();
		tr.move();
		bs.move();
		cr.move();

	}

}
