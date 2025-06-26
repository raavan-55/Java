
class Plane2 {
public void takeOff() {
	System.out.println("Plane is takeoff from runway.");
}
public void fly() {
	System.out.println("plane is flying.");
}
public void carry() {
	System.out.println("Plane is carry something.");
}
}

class PassengerPlane2 extends Plane2{
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

class CargoPlane2 extends Plane2{
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

class FighterPlane2 extends Plane2{
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

public class Plymorphism2Upcasting {
	public static void main(String[] args) {
		Plane2 ref;
		ref=new PassengerPlane2();
		ref.takeOff();
		ref.carry();
		ref.fly();
		System.out.println("_______________________________");
		ref=new CargoPlane2();
		ref.takeOff();
		ref.carry();
		ref.fly();
		System.out.println("_______________________________");
		ref=new FighterPlane2();
		ref.takeOff();
		ref.carry();
		ref.fly();
	}
}















