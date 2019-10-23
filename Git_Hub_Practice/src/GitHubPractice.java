import java.util.Random;
import java.util.Scanner;

public class GitHubPractice {
    public static void main(String[] args) {
        Random random = new Random(  ); //Ditched the math.random in favor of Random class

        Scanner scan1 = new Scanner( System.in );   // From two scanners to one
        System.out.println( "What is the first number?" );
        int first = scan1.nextInt(); //Changed from double to int
        System.out.println( "What is the second number?" );
        int second = scan1.nextInt();
        if ( second < first ) { //Throws an error if the high bound ain't high
            System.err.print( "Error: the high bound must be larger than the low bound" );
        }
        System.out.println( "Your number is: " + (random.nextInt( second - first ) + first) ) ;
    }
}
