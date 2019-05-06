import java.util.Scanner;

public class GitHubPractice {
    public static void main(String args) {
        System.out.println( "What is the first number?" );
        Scanner scan1 = new Scanner( System.in )
        System.out.println( "What is the second number?" );
        Scanner scan2 = new Scanner( System.in );
        System.out.println( "The average of the two numbers is: " + ((scan1.nextInt() + scan2.nextInt())/2)  )
    }
}
