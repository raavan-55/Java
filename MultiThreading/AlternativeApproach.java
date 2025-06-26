import java.util.Scanner;
class AlernativeApproachClass extends Thread{
	Scanner scan=new Scanner(System.in);
	public void add() {
		System.out.println("Enter a number:");
		int a=scan.nextInt();
		System.out.println("Enter b number:");
		int b=scan.nextInt();
		System.out.println(a+b);
	}
	public void print() {
		for (int i = 0; i <5; i++) {
			System.out.println("Print");
		}
	}
	public void banking() {
		System.out.println("Enter usercode:");
		int a=scan.nextInt();
		System.out.println("password:");
		int b=scan.nextInt();
		System.out.println("Passed");
	}
	public void run() {
		if(Thread.currentThread().getName()=="add") {
			add();
		}
		else if(Thread.currentThread().getName()=="banking") {
			print();
			}
		else {
			banking();
			}
	}
}

public class AlternativeApproach{

	public static void main(String[] args) {
		AlernativeApproachClass t1=new AlernativeApproachClass();
		AlernativeApproachClass t2=new AlernativeApproachClass();
		AlernativeApproachClass t3=new AlernativeApproachClass();
		t1.setName("add");
		t2.setName("banking");
		t1.start();
		t2.start();
		t3.start();

	}

}
