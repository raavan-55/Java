import java.util.Scanner;
class ReverseNumber{
	int reverseNumber(int num)
	{   int remainder;
		int reverse=0;
		 while(num!=0){
			      remainder=num%10;
				 reverse=reverse*10+remainder;
				num=num/10;
				}
		 return reverse;
	 }
	}
public class ReverseANumber {
  public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=scan.nextInt();
		ReverseNumber ref=new ReverseNumber();
		int result=ref.reverseNumber(a);
	     System.out.println(result);
		}
}
