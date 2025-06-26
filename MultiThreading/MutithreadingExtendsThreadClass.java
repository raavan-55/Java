import java.util.Scanner;
class Demo1 extends Thread{
	Scanner scan=new Scanner(System.in);
	public void run() {
		
		System.out.println("Enter a number:");
		int a=scan.nextInt();
		System.out.println("Enter b number:");
		int b=scan.nextInt();
		System.out.println(a+b);
	}
}

class Demo2 extends Thread{
	Scanner scan=new Scanner(System.in);
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Print");
		}
	}
}
class Demo3 extends Thread{
	Scanner scan=new Scanner(System.in);
	public void run() {
		System.out.println("Enter usercode:");
		int a=scan.nextInt();
		System.out.println("password:");
		int b=scan.nextInt();
		System.out.println("Passed");
	}
}
public class MutithreadingExtendsThreadClass {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
        d1.start();
        d2.start();
        d3.start();
        
	}

}
