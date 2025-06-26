import java.util.Scanner;
public class Q {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter dimention");	
	    int dim=scan.nextInt();
	    for (int i = 0; i <=dim-1; i++) {
			for (int j = 0; j <=dim-1; j++) {
				if(j==(dim/2)-i||j==dim/2+i ||j==i-(dim/2) && i>=dim/2||i>=dim/2 && j==(dim-1+(dim/2))-i||i==j &&i>=dim/2) {
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
