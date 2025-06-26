import java.util.Scanner;
public class LCMOfTwoNumber {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
	    int num1=scan.nextInt();
	    System.out.println("Enter second number :");
	    int num2=scan.nextInt();
	    if(num1!=0 && num2!=0) {
	    for (int i = 1; i <=num2; i++) {
			 for (int j = 1; j<=num1; j++) {
			if(num1*i==num2*j) {
				System.out.println("LCM of above numbers is :"+j*num2);
				System.exit(0);
			}}}
	    }
	    else {
	    	System.out.println("Please Enter non Zero value....");
	    }
	    
 }}
