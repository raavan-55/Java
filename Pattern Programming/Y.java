import java.util.Scanner;

public class Y {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimention");	
	    int dim=scan.nextInt();
	    for (int i = 0; i <=dim-1; i++) {
			for (int j = 0; j <=dim-1; j++) {
				if(i==j && j<=dim/2||i==dim-j-1 && j>=dim/2||j==dim/2 && i>=dim/2 ) {
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
