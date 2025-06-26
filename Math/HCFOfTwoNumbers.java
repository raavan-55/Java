import java.util.Scanner;
public class HCFOfTwoNumbers {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
	    int num1=scan.nextInt();
	    System.out.println("Enter second number :");
	    int num2=scan.nextInt();
	    int hcf=0;
	    for (int i = 1; i <=num2; i++) {
			 	if(num1%i==0 && num2%i==0) {
			 		hcf=i;
		}
	}
	    System.out.println("HCF of above numbers is :"+hcf);
   }
}
