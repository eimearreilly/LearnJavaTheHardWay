import java.util.Scanner;

/**
 * Created by eimearreilly on 26/01/2017.
 */
/*
Infinite Loops

Fix the code so it isn't in an infinite loop!
I added in line 26.
 */
public class ex27_KeepGuessing {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);
        System.out.println( "I have chosen a number between 1 and 10." );
        System.out.println( "Try to guess it." );
        System.out.print( "Your guess: " );
        guess = keyboard.nextInt();

        while ( secret != guess ) {
            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();}


         System.out.println( "That's right! You're a good guesser." );
         }

}

