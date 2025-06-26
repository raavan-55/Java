import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeClass {

	public static void main(String[] args) {
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India:"+ currentTime);
		System.out.println("Paris:"+ currentTimeInParis);
		System.out.println("New York:"+ currentTimeInNewYork);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		System.out.println(zoneId);
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);
		System.out.println(currentTimeInParis.compareTo(currentTimeInNewYork));
		System.out.println(currentTime.getChronology());
		
		

	}

}
