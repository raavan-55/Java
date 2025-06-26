import java.util.Scanner;
public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int len=scan.nextInt();
        Array a=new Array(len);
        while(true) {
         System.out.println("Press 1 for insertion");
         System.out.println("Press 2 for deletion");
         System.out.println("Press 3 for Display Array");
         System.out.println("Press 4 for Exit");
         System.out.print("Enter your choice :");
         int ch=scan.nextInt();
         switch(ch) {
         case 1:a.insert();
         break;
         case 2:a.delete();
         break;
         case 3:a.display();
         break;
         default:System.exit(0);
         }
        }
        
	}

}
