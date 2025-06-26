import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number :");
	    int num=scan.nextInt();
	    int fc=1;
        for (int i = 1; i <=num; i++) {
			fc=fc*i;
		}
	    System.out.print("Fatorial of "+num+" is :"+fc);
	    

	}

}
