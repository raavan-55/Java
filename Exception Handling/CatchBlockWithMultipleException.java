import java.util.InputMismatchException;
import java.util.Scanner;
class CatchBlockWithMultipleExceptionClass{
	static Scanner scan=new Scanner(System.in);
void multipleException() throws Exception  {
	try{
		System.out.println("Enter first number :");
		int a=scan.nextInt();
		System.out.println("Enter second number :");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the element");
		int ele=scan.nextInt();
		System.out.println("Enter the position");
		int pos=scan.nextInt();
		arr[pos]=ele;
		}
	catch (InputMismatchException|ArithmeticException|NegativeArraySizeException|ArrayIndexOutOfBoundsException e) {
		//e.printStackTrace();
		System.out.println("Exception was not handled in multiexception method.");
		throw e;
	}
}

}
class CatchBlockWithMultipleExceptionClassClass{
	 void multipleExceptionMethod() {
		try {
			CatchBlockWithMultipleExceptionClass cb=new CatchBlockWithMultipleExceptionClass();
			cb.multipleException();
		}
		catch (InputMismatchException|ArithmeticException|NegativeArraySizeException|ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace();
			System.out.println("Enter proper data.");
			try {
				CatchBlockWithMultipleExceptionClass cb=new CatchBlockWithMultipleExceptionClass();
				cb.multipleException();
			}
			catch (Exception e1) {
				System.out.println("nbookk");
				
			}
			}
		catch (Exception e) {
			System.out.println("Some other problem occured contact to developer.");
			
		}
	}
}

public class CatchBlockWithMultipleException {
static Scanner scan=new Scanner(System.in); 
	public static void main(String[] args) {
		CatchBlockWithMultipleExceptionClassClass ref=new CatchBlockWithMultipleExceptionClassClass();
		ref.multipleExceptionMethod();

	}
}
	