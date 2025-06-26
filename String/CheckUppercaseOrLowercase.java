import java.util.Scanner;
public class CheckUppercaseOrLowercase {
        public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String str=scan.nextLine();
		if(str==str.toUpperCase()) {
			System.out.println(str+" is uppercase");
		}
		else {
			System.out.println(str+" is lowercase");
		}

	}

}
