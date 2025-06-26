import java.util.Scanner;

class LiskovSubstitution1{
	
	static void method() throws Exception {

		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter a numner");
			int a=scan.nextInt();
		}
		catch (Exception e) {
			throw e;
		}
	}
}

public class LiskovSubstitution extends LiskovSubstitution1 {
	
	public static void main(String[] args) {
		try {
			method();
			
		}
		catch (Exception e) {
			System.out.println("exception handeled in main");
		}
		
     
	}

}
