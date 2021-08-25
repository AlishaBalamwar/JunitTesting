import java.util.*;
import java.time.DayOfWeek;
public class GregorianCalendar {
public static void main(String[] args) {
int m;	
int m1;
int y;
int y1;
int d;
int d1;
int x;
Scanner s = new Scanner(System.in);
System.out.println("enter:m,y,d");
m = s.nextInt();
y = s.nextInt();
d = s.nextInt();
y1= y-(14-m)/12;
 x = y1+y1/4-y/100 + y1/400;
m1= m + 12 *((14 - m)/12)-2;
d1 = (d + x+ 31*m1/12)%7;
DayOfWeek dayOfWeek = DayOfWeek.of(+d1);
System.out.println("Day of week - " +dayOfWeek.name());
System.out.println("Integer value of " +dayOfWeek.name() + " - " +dayOfWeek.getValue());
}
}