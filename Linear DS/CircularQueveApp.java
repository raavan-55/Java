import java.util.Scanner;

public class CircularQueveApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the length of the Circular queve :");
		   int length=scan.nextInt();
		   CircularQueve circularqueve=new CircularQueve(length);
		   while(true) {
			   System.out.println("Press 1 for ...........INSERTION");
			   System.out.println("Press 2 for ............DELETION");
			   System.out.println("Press 3 for ............display");
			   System.out.println("Press 4 for ............exit");
			   System.out.println("Enter your choice:");
			   int ch=scan.nextInt();
			   switch(ch) {
			   case 1:circularqueve.insert();
			   break;
			   case 2:circularqueve.delete();
			   break;
			   case 3:circularqueve.display();
			   break;
			   default:System.exit(0);
			   
			   }
		   }

		}

	

}
