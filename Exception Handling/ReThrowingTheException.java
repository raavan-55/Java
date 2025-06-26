import java.util.InputMismatchException;
import java.util.Scanner;
public class ReThrowingTheException {
  static Scanner scan=new Scanner(System.in);
  static void methodM1() throws InputMismatchException
   {
	  try {
	  System.out.println("Enter a number :");
	  int a=scan.nextInt();
	  System.out.println("Enter second number :");
	  int b=scan.nextInt();
	  int c=a/b;
	  System.out.println(c);
	 
	 
	   }
	   catch(ArithmeticException e) {
		 System.out.println("exception is handled in methodm1");
		   throw e;
		  }
	  finally {
		  System.out.println("Finally block.");
	  }
	  
	  }
	
	public static void main(String[] args)  {
		try {
			System.out.println("try block of main method");
			methodM1();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		}
		catch(Exception e) {
			System.out.println("exception is handled in main method");
			
		}
		

	}

}
