import java.util.Scanner;
class CountVowelsClass{
	int countVowelsClassMethod(String str) {
		int count=0;
		for (int i = 0; i <=str.length()-1; i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='I'||str.charAt(i)=='i'||str.charAt(i)=='O'||str.charAt(i)=='o'||str.charAt(i)=='U'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	
}
public class CountVowels {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=scan.nextLine();
		CountVowelsClass ref=new CountVowelsClass();
		System.out.println("No of vowels in string "+str+" is:"+ref.countVowelsClassMethod(str));

	}

}
