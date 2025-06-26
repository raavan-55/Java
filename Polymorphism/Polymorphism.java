class Plane {
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

class PassengerPlane extends Plane{
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

class CargoPlane extends Plane{
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

class FighterPlane extends Plane{
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

public class Polymorphism {
	public static void main(String[] args) {
		Plane ref;
		PassengerPlane pp=new PassengerPlane();
		ref=pp;
		ref.takeOff();
		ref.carry();
		ref.fly();
		System.out.println("_______________________________");
		CargoPlane cp=new CargoPlane();
		ref=cp;
		ref.takeOff();
		ref.carry();
		ref.fly();
		System.out.println("_______________________________");
		FighterPlane fp=new FighterPlane();
		ref=fp;
		ref.takeOff();
		ref.carry();
		ref.fly();
	}
}















