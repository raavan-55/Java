import java.util.Scanner;
public class Practice {
Scanner scan=new Scanner(System.in);
void devide() throws ArithmeticException {
	try{System.out.println("Enter first number :");
	int a=scan.nextInt();
	System.out.println("Enter second number :");
	int b=scan.nextInt();
	int c=a/b;
	System.out.println(c);
	}
	
	catch (ArithmeticException e) {
		System.out.println("11Enter not zero denominator");
		throw e;
		
	}
	catch (NegativeArraySizeException e) {
		System.out.println("Enter positive number.");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("give the position within the array size.");
	}
	catch (Exception e) {
		System.out.println("Exception is handled.");
		
	}
}
}
class Practice2{
	void method()  {
	Scanner scan=new Scanner(System.in);
	   try {
		Practice p=new Practice();
		p.devide();
	   }
	  
		catch (NegativeArraySizeException e) {
			System.out.println("Enter positive number.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("give the position within the array size.");
		}
		
	   
		/*System.out.println("Enter the length of the array :");
		int len=scan.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter the element :");
		int ele=scan.nextInt();
		System.out.println("Enter the position :");
		int pos=scan.nextInt();
		arr[pos]=ele;*/
		
		
		
		}
}

class PracticeApp{
	public static void main(String[] args){
		try {
		Practice2 p2=new Practice2();
		p2.method();
		
		}
		
		
		catch (NegativeArraySizeException e) {
			System.out.println("Enter positive number.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("give the position within the array size.");
		}
		
		}
	}
