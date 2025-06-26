import java.time.LocalDateTime;
import java.time.Month;
public class LocalDateTimeClass {
      public static void main(String[] args) {
		LocalDateTime ltd=LocalDateTime.now();
		System.out.println(ltd);  //2022-11-28T09:52:39.317741800
		System.out.println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30)); //2015-02-20T06:30
		LocalDateTime ltd2=LocalDateTime.parse("2000-01-27T10:00:00");
		System.out.println(LocalDateTime.parse("2015-02-20T06:30:00")); //2015-02-20T06:30
        System.out.println(ltd.plusDays(1)); //2022-11-29T10:01:27.230140700
        System.out.println(ltd.plusWeeks(2)); //2022-12-12T10:01:27.230140700
        System.out.println(ltd.isAfter(ltd2)); //true
        System.out.println(ltd.compareTo(ltd2)); //22
        System.out.println(ltd.getChronology()); //ISO
	}

}
