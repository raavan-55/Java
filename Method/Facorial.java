import java.util.Scanner;
class MethodFactorial{
	int  fact(int a){
		if(a==0){
			return 1;
		}
		else{
			return a*fact(a-1);
		}
	}
}
class Facorial {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);{
	System.out.println("Enter the number :");
	int num=scan.nextInt();
	MethodFactorial ref=new MethodFactorial();
	int res=ref.fact(num);
	System.out.println(res);
	
	

}}}
