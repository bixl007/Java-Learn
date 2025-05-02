import java.time.LocalDate;

public class _027_dateTimeApi {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1 = LocalDate.of(2025, 3, 15);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2025-03-15");
        System.out.println(date2);
    }
}
