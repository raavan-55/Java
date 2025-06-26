import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int len=scan.nextInt();
        Stack a=new Stack(len);
        while(true) {
         System.out.println("Press 1......................<-PUSH");
         System.out.println("Press 2......................<-POP");
         System.out.println("Press 3......................<- Display Array");
         System.out.println("Press 4......................<- Exit");
         System.out.print("Enter your choice :");
         int ch=scan.nextInt();
         switch(ch) {
         case 1:a.push();
         break;
         case 2:a.pop();
         break;
         case 3:a.display();
         break;
         default:System.exit(0);
         }
        }

	}

}
