import java.util.Scanner;

class AvoidMultitheadindJoinMethod extends Thread {
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
public class ThreadSafeUsingJoinMethod {

	public static void main(String[] args) {
		try {
		AvoidMultitheadindJoinMethod t1=new AvoidMultitheadindJoinMethod();
		AvoidMultitheadindJoinMethod t2=new AvoidMultitheadindJoinMethod();
		AvoidMultitheadindJoinMethod t3=new AvoidMultitheadindJoinMethod();
		t1.setName("add");
		t2.setName("banking");
         t1.start();
       // t1.join();
         t2.start();
        t2.join();
         t3.start();
      //  t3.join();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
