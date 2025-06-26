import java.util.Scanner;
class GuessNumberExcepton extends Exception{
	public String getMessage() {
		return "Wrong number.";
	}
}
public class CustomExceptionPredictANumber {
static Scanner scan=new Scanner(System.in);

static int attempt=1;

	public static void main(String[] args) {
		
		try {
		CustomExceptionPredictANumber ref=new CustomExceptionPredictANumber();
		ref.playerMethod();
		}
		catch (Exception gne) {
			attempt++;
			main(null);
			  
		}
}
	void playerMethod() throws GuessNumberExcepton {
		System.out.println("Guess the number :");
		int guess=scan.nextInt();
		
		if(guess==7) {
			System.out.println("Got the number in "+attempt+" attempt.");
		}
		else {
			GuessNumberExcepton gne=new GuessNumberExcepton();
			System.out.println(gne.getMessage());
			throw gne;
			
		}
	}

}
