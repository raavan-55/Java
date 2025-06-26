import java.util.InputMismatchException;
import java.util.Scanner;
class Atm {
Scanner scan=new Scanner(System.in);
public void devide() throws Exception   {
	try {
	System.out.println("Enter first number :");
	int a=scan.nextInt();
	System.out.println("Enter second number :");
	int b=scan.nextInt();
	int c=a/b;
	System.out.println(c);
	}
	catch(Exception e) {
		System.out.println("111Catch block.");
		throw e;
	}
	
	finally {
		System.out.println("finally block");
	}
}
}
class Bank{
	public void method() throws Exception {
		    try {      
			Atm atm=new Atm();
			atm.devide();
		    }
		    catch (Exception e) {
				System.out.println("__+_+_+_+_+_+_+_++_+_+_+_+");
				throw e;
			}	
		}
}

class ThrowingTheException{
	public static void main(String[] args) {
		try {
		    Bank bank=new Bank();
			bank.method();
			}
			catch (InputMismatchException e1) {
				System.out.println("Enter numeric value.");
				
			}
			catch (ArithmeticException e1) {
				System.out.println("Enter not zero denominator");
			}
			
			catch (Exception e1) {
				System.out.println("Exception is handled.");
			}
		}
	}

