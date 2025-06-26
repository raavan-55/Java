import java.time.LocalDate;
public class LocalDateClass {
       public static void main(String[] args) {
    	   LocalDate d=LocalDate.now();
    	   System.out.println(d); //2022-11-25
    	   System.out.println(d.getDayOfMonth()+" "+d.getMonth()+" "+d.getYear());//25 NOVEMBER 2022
    	   System.out.println(d.getDayOfMonth()+" "+d.getMonthValue()+" "+d.getYear());//25 11 2022
    	   d=d.plusMonths(1);
    	   System.out.println(d); //2022-12-25
    	   d=d.minusDays(1);
    	   System.out.println(d);  //2022-12-24
    	   LocalDate tomorrow = LocalDate.now().plusDays(1);//2022-11-26
    	   int twelve = LocalDate.parse("2022-11-26").getDayOfMonth();
    	   System.out.println(twelve);//26
    	   //compareTo method in java
    	   LocalDate dt = LocalDate.parse("1777-01-01");
           LocalDate dt1 = LocalDate.parse("2018-12-01");
           System.out.println(dt1); //2018-12-14
           System.out.println(dt1.compareTo(dt)); //241..........//it considered only first value
           System.out.println(dt1.isAfter(dt)); //true..........//check the date dt1 is after dt are or not 
           System.out.println(dt1.isBefore(dt)); //false.......//check the date dt1 is before dt are or not
           System.out.println(dt1.isEqual(dt)); //false ......//check both the date equal or not
           System.out.println(dt.isLeapYear()); //false .....//check the year leap year or not
           System.out.println(dt1.minusWeeks(1));//2018-11-24 //return one week before date
       }
}
