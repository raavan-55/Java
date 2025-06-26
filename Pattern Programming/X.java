import java.util.Scanner;

public class X {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimention");	
	    int dim=scan.nextInt();
	    for (int i = 0; i <=dim-1; i++) {
			for (int j = 0; j <=dim-1; j++) {
				if(i==j ||i==dim-j-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
	    }


	}

}
