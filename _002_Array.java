import java.util.Scanner;

public class _002_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Number " + (i + 1) + " is " + number[i]);
        }

        sc.close();
    }
}