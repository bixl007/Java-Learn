import java.util.Date;

public class _025_dateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long millis = date.getTime();
        System.out.println(millis);

    }
}