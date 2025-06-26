import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String str=scan.nextLine();
		System.out.println("Enter string 2 :");
		String str2=scan.nextLine();
        if(str.compareTo(str2)<0) {
        	System.out.println(str+" is greater than "+str2);
        }
        else {
        	System.out.println(str+" is smaller than "+str2);
        }
	}

}
