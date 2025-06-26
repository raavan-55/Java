import java.util.Scanner;
public class QueveApp {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter the length of the queve :");
	   int length=scan.nextInt();
	   Queve queve=new Queve(length);
	   while(true) {
		   System.out.println("Press 1 for ...........INSERTION");
		   System.out.println("Press 2 for ............DELETION");
		   System.out.println("Press 3 for ............display");
		   System.out.println("Press 4 for ............exit");
		   System.out.println("Enter your choice:");
		   int ch=scan.nextInt();
		   switch(ch) {
		   case 1:queve.insert();
		   break;
		   case 2:queve.deletion();
		   break;
		   case 3:queve.display();
		   break;
		   default:System.exit(0);
		   
		   }
	   }

	}

}
