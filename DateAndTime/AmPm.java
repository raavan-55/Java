import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.DateFormat;
import java.text.ParseException;
public class AmPm
{
	public static void main(String[] args) throws ParseException {
	DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    String dateString = dateFormat.format(new Date()).toString();
    System.out.println("Current time in AM/PM: "+dateString);
    DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
    String dateString2 = dateFormat2.format(new Date()).toString();
    System.out.println("Current date and time in AM/PM: "+dateString2);
    System.out.println("24 hour formate :"+new Date());
    DateFormat outputformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");
    System.out.println("12 hour formate :"+outputformat.format(new Date()));
    System.out.println(new Date());
   }
}