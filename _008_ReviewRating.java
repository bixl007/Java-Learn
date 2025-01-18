/*
Single File Programming Question
Problem Statement



Sarah, a reviewer for MovieMania Reviews, is updating the database with recent ratings and reviews for the film 'Tenet' directed by Christopher Nolan.



Create a program that records and displays the rating and review details for the movie.

Input format :
The first line of input consists of an integer N, representing the movie rating (1 to 5 stars).

The second line consists of a string containing the review text.

Output format :
The first line of output prints "Recent Review Rating: [N] stars"

The second line prints "Review Details: " followed by the review text.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N ≤ 5

Sample test cases :
Input 1 :
4
The movie has a complex narrative but is visually stunning.
Output 1 :
Recent Review Rating: 4 stars
Review Details: The movie has a complex narrative but is visually stunning.
Input 2 :
5
An incredible film with mind-blowing sequences and outstanding performances.
Output 2 :
Recent Review Rating: 5 stars
Review Details: An incredible film with mind-blowing sequences and outstanding performances.

*/ 

// You are using Java
import java.util.*;

public class _008_ReviewRating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Recent Review Rating: " + num + " stars");
        String st = sc.nextLine();
        System.out.println("Review Details: " + st); 
        
        sc.close();
    }
}