import java.util.Scanner;

public class SumOfDigitOfANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
	    int num=scan.nextInt();
	    int sum=0;
	    while(num!=0) {
	    	int rem=num%10;
	    	sum=sum+rem;
	    	num=num/10;
	    }
	    System.out.println("Sum of digits of above number is :"+sum);

	}

}
