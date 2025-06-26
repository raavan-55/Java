import java.util.Scanner;
class NotMatched extends Exception{
      public String getMessage() {
    	  return "Incorrect user name or password";
      }
}
class AtmCustomException{
	int acc=1111;
	int pin=1234;
	int u_a;
	int u_p;
	public void takeInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account number :");
		u_a=scan.nextInt();
		System.out.println("Enter pin :");
		u_p=scan.nextInt();
	}
	public void verify() throws Exception {
		if(u_a==acc && u_p==pin) {
			System.out.println("Collect your cash.");
		}
		else {
			NotMatched nm=new NotMatched();
			System.out.println(nm.getMessage());
			throw nm;
			
		}
	}
}
class BankCustomException{
	public void operate() {
	try {
	AtmCustomException ace=new AtmCustomException();
	   ace.takeInput(); 
	   ace.verify();
	}
	catch(Exception nm){
		try {
			AtmCustomException ace=new AtmCustomException();
			   ace.takeInput(); 
			   ace.verify();
		}
		catch(Exception nm1) {
            try {
            	AtmCustomException ace=new AtmCustomException();
 			   ace.takeInput(); 
 			   ace.verify();
            }
            catch(Exception nm2) {
            	System.out.println("Your card is blocked");
            }
		}
	}
	}
}
public class CustomException{
	public static void main(String[] args) {
		BankCustomException bce=new BankCustomException();
		bce.operate();
	}
}