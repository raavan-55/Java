import java.util.Scanner;

public class GreatestInThreeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=scan.nextInt();
		System.out.println("Enter Second number");
		int b=scan.nextInt();
		System.out.println("Enter Third number");
		int c=scan.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println("Greatest number is :"+a);
			}
			else {
				System.out.println("Greatest number is :"+c);
			}
		}
		else {
			if(b>c) {
			System.out.println("Greatest number is :"+b);
			}
			else {
				System.out.println("Greatest number is :"+c);
			}
		}

	}

}
