import java.util.InputMismatchException;
import java.util.Scanner;
public class MulripleTryCatchBlock {
public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Connection is stablished.");
			System.out.println("Enter numerator.");
			int a=scan.nextInt();
			System.out.println("Enter denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch (InputMismatchException e) {
			System.out.println("Enter Integer value.");
		}
		catch (ArithmeticException e) {
			System.out.println("Enter not zero denominator");
		}
		catch (Exception e) {
			System.out.println("Some problem occured.");
		    }
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the length of the array :");
			int len=scan.nextInt();
			int arr[]=new int[len];
			System.out.println("Enter the element");
			int ele=scan.nextInt();
			System.out.println("Enter the position");
			int pos=scan.nextInt();
			arr[pos]=ele;
	        }
		catch (InputMismatchException e1) {
			System.out.println("Enter Integer value.");
		    }
			catch (NegativeArraySizeException e1) {
				System.out.println("Enter positive number.");
		     }
		    catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("give the value within the array size.");
		    }
		   catch (Exception e1) {
			System.out.println("Some problem occured.");
		    }
		   System.out.println("Connection is terminated.");
		}
}
