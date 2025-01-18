/*
 Single File Programming Question
Problem Statement



Lena is managing the ticketing system for an upcoming concert. She needs to provide a detailed summary of each ticket purchase. 



Write a program that reads the concert name, seat number, ticket price, and ticket availability status, then displays these details in a formatted ticket summary.

Input format :
The first line of input consists of a string, representing the concert name.

The second line consists of an integer, representing the seat number.

The third line consists of a float value, representing the ticket price.

The fourth line consists of a boolean value, representing the ticket availability status.

Output format :
The first line of output prints the concert name.

The second line prints the seat number.

The third line prints the ticket price, rounded off to two decimal places.

The fourth line prints the availability status.



Refer to the sample output for the exact text and format.

Code constraints :
The concert name is a non-empty string.

1 ≤ seat ≤ 100

1.0 ≤ ticket price ≤ 1000.0

Sample test cases :
Input 1 :
Summer Music Fest
12
59.99
true
Output 1 :
Concert Name: Summer Music Fest
Seat Number: 12
Ticket Price: 59.99
Available: true
Input 2 :
Marakuma Nenjam
34
75.50
false
Output 2 :
Concert Name: Marakuma Nenjam
Seat Number: 34
Ticket Price: 75.50
Available: false
 */

import java.util.*;
import java.text.DecimalFormat;

public class _009_TicketCheck {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int seatNum = sc.nextInt();
        float price = sc.nextFloat();
        boolean avail = sc.nextBoolean();
        DecimalFormat formatter = new DecimalFormat("#0.00");

        System.out.println("Concert Name: " + st);
        System.out.println("Seat Number: " + seatNum);
        System.out.println("Ticket Price: " + formatter.format(price));
        System.out.println("Available: " + avail);

        sc.close();

    }
}