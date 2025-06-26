class Plane5 {
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

class PassengerPlane5 extends Plane5{
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

class CargoPlane5 extends Plane5{
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

class FighterPlane5 extends Plane5{
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

class FlexibleCompactness{
	public static void  flexibleMethod(Plane4 reference) {
		reference.takeOff();
		reference.fly();
		reference.carry();
		System.out.println("__________________________________________");
	}
}


public class PolymorphismFlexibilityAndCompactness2{
	public static void main(String[] args) {
		FlexibleCompactness.flexibleMethod(new PassengerPlane4());
		FlexibleCompactness.flexibleMethod(new CargoPlane4());
		FlexibleCompactness.flexibleMethod(new FighterPlane4());
	}
}















