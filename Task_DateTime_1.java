
import java.util.Calendar;

public class Task_DateTime_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time:" + cal.getTime());
        System.out.println("Actual Year: " + cal.get(Calendar.YEAR));
        System.out.println("Actual Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Actual Week of Year: " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Date: " + cal.get(Calendar.DATE));
    }
}
