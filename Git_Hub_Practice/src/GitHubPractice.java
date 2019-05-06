public class GitHubPractice {
    public static void main(String args) {
        System.out.println( "What is the first number?" );
        Scanner scan1 = new Scanner( System.in )
        System.out.println( "What is the second number?" );
        Scanner scan2 = new Scanner( System.in );
        int first = scan1.nextInt();
        System.out.println( "Your number is: " + ((int)(Math.random()*(first - scan2.nextInt())) + first) )
    }
}
