import java.util.Scanner;
public class TryCatch {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=scan.nextInt();
		System.out.println("Enter a number :");
		int b=scan.nextInt();
		try {
		int c=a/b;
		System.out.println("Result is :"+c);
		}
		catch (Exception e) {
			System.out.println("Exeption is handled.");
		}
		

	}

}
