import java.util.Scanner;
class RecuranceClass{
	int recurance(int one,int two){
		
		if(two==0)
		{
			return one;
		}
		else{
			return recurance(two,one%two);
			
		}
		
	}
}
public class Recurance {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number :");
	int a=scan.nextInt();
	System.out.println("Enter second number :");
	int b=scan.nextInt();
	RecuranceClass ref=new RecuranceClass();
	int res=ref.recurance(a,b);
	System.out.println(res);
	
}
}
