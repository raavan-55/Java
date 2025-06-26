import java.time.Clock;
import java.time.Instant;
public class InstantClass {
public static void main(String[] args) {
		Instant instant1=Instant.now();
		System.out.println("Instant1: " + instant1);
		 Instant instant2 = Instant.now(Clock.systemUTC());
		 System.out.println("Instant2: " + instant2);
	        Instant instant3 = Instant.parse("1980-04-09T10:15:30.00Z");
	        System.out.println("Instant3: " + instant3);
	        }
}
