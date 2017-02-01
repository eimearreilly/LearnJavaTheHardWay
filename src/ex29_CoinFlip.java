/**
 * Created by eimearreilly on 26/01/2017.
 */
import java.util.Scanner;
/*
Change the code to use a while loop instead of a do-while loop.

// moved the while from the end of code to the start
and put again = "y"
 */

public class ex29_CoinFlip {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in); String coin, again = "y";
        int streak = 0;
        boolean gotHeads;
        while ( again.equals("y") ) {
            gotHeads = Math.random() < 0.5;
            if ( gotHeads ) coin = "HEADS";
            else
                coin = "TAILS";
            System.out.println("You flip a coin and it is... " + coin);

            if ( gotHeads ) {
                streak++;
                System.out.println("\tThat's " + streak + " in a row....");
                System.out.print("\tWould you like to flip again (y/n)? ");
                again = keyboard.next();
            }
            else {
                System.out.println("\tYou lose everything!"); System.out.println("\tShould've quit while you were aHEAD...."); streak = 0;
                again = "n";
            }
        } ;
        System.out.println( "Final score: " + streak );
    }
}
