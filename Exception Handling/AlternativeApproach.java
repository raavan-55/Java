import java.util.Scanner;
class AlternativeApproachClass extends Thread{
	Scanner scan=new Scanner(System.in);
	public void run() {
		if(getName().equals("task1")) {
			add();
		} 
		else if(getName().equals("task2")) {
			print();
		}
		else {
			banking();
		}
	}
	
	
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
}
public class AlternativeApproach {
    public static void main(String[] args) {
    	try {
    	AlternativeApproachClass t1=new AlternativeApproachClass();
    	AlternativeApproachClass t2=new AlternativeApproachClass();
    	AlternativeApproachClass t3=new AlternativeApproachClass();
    	t1.setName("task1");
    	t2.setName("task2");
    	t3.setName("task3");
        t1.start();
        t2.start();t2.join();
        t3.start();
        
         System.out.println("t1 "+t1.isAlive());
        System.out.println("t2 "+t2.isAlive());
        System.out.println("t3 "+t3.isAlive());
    	}
    	catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}

}
