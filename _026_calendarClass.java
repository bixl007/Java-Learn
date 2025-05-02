import java.util.Calendar;

public class _026_calendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2025, Calendar.MARCH, 15);
        System.out.println(calendar.getTime());
    }
}
