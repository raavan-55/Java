import java.util.InputMismatchException;
import java.util.Scanner;
class PrintStackTraceMethod{
	Scanner scan=new Scanner(System.in);
	void devide() throws Exception{
		try {
		System.out.println("Enter Numerator");
		int num1=scan.nextInt();
		System.out.println("Enter Deniminator");
		int num2=scan.nextInt();
		int num3=num1/num2;
		System.out.println(num3);
		}
		catch (Exception e) {
			System.out.println("Exception is handled in devide method");
			e.printStackTrace();
			throw e;
		}
	}
}
public class PrintStackTrace {

	public static void main(String[] args) {
		try {
		 PrintStackTraceMethod ref=new  PrintStackTraceMethod();
		 ref.devide();
		}
		catch (Exception e) {
			System.out.println("Exception is handled in main method.");
		   
		}	
		}
	

}
