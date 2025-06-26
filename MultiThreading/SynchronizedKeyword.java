import java.util.Scanner;

class SynchronizedKeywordClass implements Runnable{
	
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
	synchronized public void run() {
		if(Thread.currentThread().getName()=="add") {
			 add();
		}
		else if(Thread.currentThread().getName()=="banking") {
			print();
			}
		else if(Thread.currentThread().getName()=="print") {
			banking();
			} 
	}
		
	}

public class SynchronizedKeyword {

	public static void main(String[] args) {
		SynchronizedKeywordClass ref=new SynchronizedKeywordClass();
		Thread t1=new Thread(ref);
		Thread t2=new Thread(ref);
		Thread t3=new Thread(ref);
        t1.setName("add");
		t2.setName("banking");
		t3.setName("print");
		t1.start();
		t2.start();
		t3.start();

	}

}
