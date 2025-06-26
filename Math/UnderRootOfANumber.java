import java.util.Scanner;
public class UnderRootOfANumber {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
	    int num=scan.nextInt();
	    for (int i = 0; i <=num/2; i++) {
			if(i*i==num) {
				System.out.println("Under root of "+num+" is :"+i);
			}
		}
	}
}
