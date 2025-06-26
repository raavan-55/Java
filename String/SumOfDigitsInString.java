import java.util.Scanner;
class SumOfDigitsInStringClass{
	int sumOfDigitsInStringMethod(String str) {
		int sum=0;
		for (int i = 0; i <=str.length()-1; i++) {
			if(Character.isDigit(str.charAt(i)))
			{
				int n=Character.getNumericValue(str.charAt(i));
				sum=sum+n;
			}
			
		}
		return sum;
	}
}
public class SumOfDigitsInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=scan.nextLine();
		SumOfDigitsInStringClass ref=new SumOfDigitsInStringClass();
		System.out.println("Sum of digits of string "+str+" is:"+ref.sumOfDigitsInStringMethod(str));
	}

}
