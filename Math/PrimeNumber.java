import java.util.Scanner;
public class PrimeNumber {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number :");
	    int num=scan.nextInt();
	    for (int i = 2; i <=num; i++) {
			if(num%i==0) {
				if(i==num) {
					System.out.println(num+" is prime");
				}
				else {
					System.out.println(num+" is not prime");
					System.exit(0);
				     }
			   }
           }
	    }
}
