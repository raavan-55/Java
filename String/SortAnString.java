import java.util.Arrays;
import java.util.Scanner;

public class SortAnString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		str=new String(ch);
		System.out.println("Sorted string is :"+str);

	}

}
