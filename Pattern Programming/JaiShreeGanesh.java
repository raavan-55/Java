import java.util.Scanner;
public class JaiShreeGanesh {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the dimention:");
	int dim=scan.nextInt();
	for (int i = 0; i <=dim-1; i++) {
		for (int j = 0; j <=dim-1; j++) {
			if(i==0||i==dim-1 && j<dim/2||j==dim/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		
		System.out.print(" "); 
		for (int j = 0; j <=dim-1; j++) {
			if(i==0||i==dim/2||j==0||j==dim-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
		for (int j = 0; j <=dim-1; j++) {
			if(i==0||i==dim-1||j==dim/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("   "); 
		for (int j = 0; j <=dim-1; j++) {
			if(i==0||i==dim-1||i==dim/2||j==0 && i<=dim/2||j==dim-1 && i>=dim/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
		for (int j = 0; j <=dim-1; j++) {
			if(i==dim/2||j==dim-1 || j==0) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		 System.out.print(" ");
		 for (int j = 0; j <=dim-1; j++) {
				if(i==0 && j<=dim/2||i==dim/2 && j<=dim/2||j==dim/2 && i<=dim/2 || j==0||i>=dim/2 && j==i-dim/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.print(" ");
		 for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim-1||i==dim/2|| j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.print(" ");
		 for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim-1||i==dim/2|| j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.print("   ");
		 for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim-1||i==dim/2 && j>=dim/2|| j==0||j==dim-1 && i>=dim/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		 System.out.print(" ");
		 for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim/2||j==0||j==dim-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j <=dim-1; j++) {
				if(i==j||j==0||j==dim-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim/2||i==dim-1||j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j <=dim-1; j++) {
				if(i==0||i==dim/2||i==dim-1||j==0 && i<=dim/2||j==dim-1 && i>=dim/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 0; j <=dim-1; j++) {
				if(i==dim/2||j==0||j==dim-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
		 
		System.out.println();
		
	}

	}

}
