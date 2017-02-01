import java.util.Scanner;

/**
 * Created by eimearreilly on 31/01/2017.
 */
public class Ex44CountingFor {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        int n;
        String message;

        System.out.println("Enter a message and I'll display it 5 times.");
        System.out.print("Message: ");
        message = kb.nextLine();

        for( n=1; n<=5; n++){
            System.out.println(n + ". " + message);
        }
        System.out.println( "\nNow I'll show it ten times and count by 5s." ); for ( n = 5 ; n <= 50 ; n += 5 ) {
            System.out.println( n + ". " + message );
        }

        System.out.println( "\nFinally, three times counting backward." ); for ( n = 3 ; n > 0 ; n -= 1 ) {
            System.out.println( n + ". " + message );
        }

    }
}
