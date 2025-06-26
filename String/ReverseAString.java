import java.util.Scanner;
class ReverseAStringClass{
	String reverseAStringMethod(String str) {
		int rev=str.length()-1;
		char ch[]=new char[str.length()];
		for (int i = 0; i <=ch.length-1; i++) {
			ch[i]=str.charAt(rev);
			rev--;
		}
		str=String.valueOf(ch);
		return str;
	}
}
public class ReverseAString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=scan.nextLine();
		ReverseAStringClass ref=new ReverseAStringClass();
		System.out.println("Reverse of "+str+" is:"+ref.reverseAStringMethod(str));

	}

}
