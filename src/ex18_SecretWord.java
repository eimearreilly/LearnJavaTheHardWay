import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
Pick a second secret word that will also work.
Then add an OR to the first if statement so that typing EITHER word makes it print out “That’s correct!”.
 */
public class ex18_SecretWord {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String secret = "please", guess;

        System.out.print( "What's the secret word? " );
        guess = keyboard.next();

        if ( guess.equals(secret) || guess.equals("eimear") ) { System.out.println( "That's correct!" );
        }
        else {
            System.out.println( "No, the secret word isn't \"" + guess + "\"." );
        }
        if ( guess == secret ) {
            System.out.println( "(This will never ever show, no matter what.)" );

    }
}}
