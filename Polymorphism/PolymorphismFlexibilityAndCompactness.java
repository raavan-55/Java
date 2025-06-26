
class Plane4 {
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

class PassengerPlane4 extends Plane4{
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

class CargoPlane4 extends Plane4{
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

class FighterPlane4 extends Plane4{
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

class Flexible{
	public void flexibleMethod(Plane4 reference) {
		reference.takeOff();
		reference.fly();
		reference.carry();
	}
}


public class PolymorphismFlexibilityAndCompactness{
	public static void main(String[] args) {
		Flexible f=new Flexible();
		PassengerPlane4 pp=new PassengerPlane4();
		CargoPlane4 cp=new CargoPlane4();
		FighterPlane4 fp=new FighterPlane4();
		f.flexibleMethod(pp);
		System.out.println("__________________________________________");
		f.flexibleMethod(cp);
		System.out.println("__________________________________________");
		f.flexibleMethod(fp);
	}
}















