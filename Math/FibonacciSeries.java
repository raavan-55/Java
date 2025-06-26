import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the terms :");
         int term=scan.nextInt();
         int zero=1;
         int first=0;
         int ans=0;
         for (int i = 1; i <=term; i++) {
        	System.out.print(first+" ");
			first=zero+first;
			zero=ans;
			ans=first;
	     }
	}

}
