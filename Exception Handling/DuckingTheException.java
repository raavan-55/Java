import java.util.Scanner;
class DuckAtm{
	void duckMethod1() throws Exception {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter first number :");
			int a=scan.nextInt();
			System.out.println("Enter first number :");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			}
		finally {
			System.out.println("Atm finally block.");
		}
	}
}
class DuckBank{
	void duckMethod2() throws Exception {
		DuckAtm atm=new DuckAtm();
		atm.duckMethod1();
	}
}
public class DuckingTheException {
public static void main(String[] args){
	try {
	DuckBank db=new DuckBank();
	db.duckMethod2();
	}
	catch(Exception e) {
		System.out.println("Exception is handled");
	}
}
}
