import java.util.Scanner;
public class FactorsOfANumber {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
	System.out.print("Enter number :");
	int a=scan.nextInt();
	System.out.print("Factors of "+a+" is :");
	for (int i = 1; i <=a; i++) {
		if(a%i==0) {
			System.out.print(i+" ");
		}
	}
	}
}
