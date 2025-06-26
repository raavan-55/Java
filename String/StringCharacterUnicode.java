import java.util.Scanner;
class StringCharacterUnicodeClass{
	static void StringCharacterUnicodeMethod(String str) {
		System.out.println("Original String is :"+str);
		for (int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i)!=' ') {
			System.out.println("The unicode of "+str.charAt(i)+" is "+(int)str.charAt(i));
			}
			else {
				System.out.println("The unicode of"+str.charAt(i)+"space is "+(int)str.charAt(i));
			}
		}

	}
}
public class StringCharacterUnicode {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string :");
    String str=scan.nextLine();
    StringCharacterUnicodeClass.StringCharacterUnicodeMethod(str);
}
}
