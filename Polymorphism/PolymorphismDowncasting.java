class Plane3 {
public void takeOff() {
	System.out.println("Plane is takeoff from runway.");
}
public void fly() {
	System.out.println("plane is flying.");
}

}

class PassengerPlane3 extends Plane3{
	public void takeOff() {
		System.out.println("Plane is takeoff in moderate runway.");
	}
	public void fly() {
		System.out.println("plane is flying with modrate speed.");
	}
	public void carry() {
		System.out.println("Plane is carry Passenger.");
	}
}

class CargoPlane3 extends Plane3{
	public void takeOff() {
		System.out.println("Plane is takeoff from long runway.");
	}
	public void fly() {
		System.out.println("plane is flying with slow speed.");
	}
	public void carry() {
		System.out.println("Plane is carry goods.");
	}
}

class FighterPlane3 extends Plane3{
	public void takeOff() {
		System.out.println("Plane is takeoff from short runway.");
	}
	public void fly() {
		System.out.println("plane is flying with high speed.");
	}
	public void carry() {
		System.out.println("Plane is carry weapons.");
	}
}

// downcasting-(parent class reference type access child class specialised method.)
public class PolymorphismDowncasting {
	public static void main(String[] args) {
		Plane3 ref;
		ref=new PassengerPlane3();
		ref.takeOff();
		((PassengerPlane3) ref).carry(); // downcasting
		ref.fly();
		System.out.println("_______________________________");
		ref=new CargoPlane3();
		ref.takeOff();
		((CargoPlane3) ref).carry(); //downcasting
		ref.fly();
		System.out.println("_______________________________");
		ref=new FighterPlane3();
		ref.takeOff();
		((FighterPlane3) ref).carry(); //downcasting
		ref.fly();
	}
}















