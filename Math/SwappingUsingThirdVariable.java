import java.util.Scanner;
public class SwappingUsingThirdVariable {
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number :");
    int a=scan.nextInt();
    System.out.println("Enter second number :");
    int b=scan.nextInt();
    System.out.println("Numbers is "+a+","+b);
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("Reverse is "+a+","+b);
	}

}
