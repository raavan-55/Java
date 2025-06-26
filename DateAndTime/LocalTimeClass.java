import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LocalTimeClass {
    public static void main(String[] args) {
		LocalTime t=LocalTime.now();
		System.out.println(t); //10:25:53.985918
		System.out.println(t.plusHours(5)); //15:29:55.231135800
		System.out.println(t.getHour()+" "+t.getMinute()); //1 31
		LocalTime sixThirty = LocalTime.parse("06:30");
		System.out.println(sixThirty); //06:30
		LocalTime sixThirty2 = LocalTime.of(06, 28);
		System.out.println(sixThirty2); //06:28
		LocalTime y=LocalTime.of(14,45,12);
		System.out.println(y); // 02:45:12
		LocalTime ltt=LocalTime.of(03, 00);
		System.out.println(sixThirty.compareTo(ltt)); //1
		System.out.println(sixThirty.isAfter(t));
		System.out.println(sixThirty.isBefore(t));
		System.out.println(sixThirty.minusHours(2)); //04:30
		System.out.println(sixThirty.minusMinutes(2)); //06:28
		System.out.println(sixThirty.getMinute()); //30
		LocalTime lt=LocalTime.parse("14:45:12");
		System.out.println(lt.withHour(2));
		System.out.println(lt.withMinute(2));
		System.out.println(lt.MIDNIGHT);
		System.out.println(lt.NOON);
		System.out.println(lt.MAX);
	}

}
