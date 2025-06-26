class Animal{
	public void eat() {
		System.out.println("Animal is eat something");
	}
	public void sleep() {
		System.out.println("Animal is sleep in jungle");
	}
	public void foodHabbit() {
		System.out.println("Animal eat both grass and meat");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is eat meat");
	}
	public void sleep() {
		System.out.println("tiger is sleep in cave");
	}
	public void foodHabbit() {
		System.out.println("tiger eat only meat");
	}
}
class Deer extends Animal{
	public void eat() {
		System.out.println("Deer is eat grass");
	}
	public void sleep() {
		System.out.println("Deer is sleep in ground");
	}
	public void foodHabbit() {
		System.out.println("Deer eat only grass");
	}
}
class Monkey extends Animal{
	public void eat() {
		System.out.println("Monkey is eat fruit");
	}
	public void sleep() {
		System.out.println("Monkey is sleep on tree");
	}
	public void foodHabbit() {
		System.out.println("Monkey eat only grass");
	}
}

class Flexiblity{
	public static void flexible(Animal ref) {
		ref.eat();
		ref.sleep();
		ref.foodHabbit();
		System.out.println("_______________________________________________9");
	}
}


public class RealPolymorphism {

	public static void main(String[] args) {
		Flexiblity.flexible(new Tiger());
		Flexiblity.flexible(new Deer());
		Flexiblity.flexible(new Monkey());
		
	}

}
