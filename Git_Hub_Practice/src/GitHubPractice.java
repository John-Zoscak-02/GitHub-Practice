import java.util.Scanner;

public class GitHubPractice {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner( System.in );
        System.out.println( "What is the first number?" );
        double first = scan1.nextDouble();
        System.out.println( "What is the second number?" );
        double second = scan1.nextDouble();
        System.out.println( "Your number is: " + (first + second) / 2);
    }
}
