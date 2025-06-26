import java.util.Scanner;
class Demor1 implements Runnable{
	Scanner scan=new Scanner(System.in);
	public void run() {
		System.out.println("Enter a number:");
		int a=scan.nextInt();
		System.out.println("Enter b number:");
		int b=scan.nextInt();
		System.out.println(a+b);
	}
}

class Demor2 implements Runnable{
	Scanner scan=new Scanner(System.in);
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Print");
		}
	}
}
class Demor3 implements Runnable{
	Scanner scan=new Scanner(System.in);
	public void run() {
		System.out.println("Enter usercode:");
		int a=scan.nextInt();
		System.out.println("password:");
		int b=scan.nextInt();
		System.out.println("Passed");
	}
}

public class MultithreadingImplementsRunnableInterface {
 public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
	}

}
