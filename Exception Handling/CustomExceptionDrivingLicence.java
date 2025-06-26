import java.util.Scanner;
class DlException extends Exception{
	public String getMessage() {
		return "You are not Eligible for Dl";
	}
}
public class CustomExceptionDrivingLicence {
    static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)  {
		try {
		CustomExceptionDrivingLicence.verification();
		}
		catch (Exception ref) {
			try {
				System.out.println("This is your second chance.");
			CustomExceptionDrivingLicence.verification();
			}
			catch (Exception ref1) {
				try {
					System.out.println("This is your third chance.");
					CustomExceptionDrivingLicence.verification();
				}
				catch (Exception e) {
					System.out.println("You are not eligible for dl.");
				}
			}
		}

	}
     
	static void verification() throws DlException {
		System.out.println("Enter your age :");
		int age=scan.nextInt();
		if(18<=age && age<=65) {
			System.out.println("You are eligible for Dl.");
		}
		else {
			DlException ref=new DlException();
			ref.getMessage();
			throw ref;
		}
	}
	
}
