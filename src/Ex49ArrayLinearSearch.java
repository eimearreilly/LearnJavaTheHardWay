/**
 * Created by eimearreilly on 31/01/2017.
 */

import java.util.Scanner;

public class Ex49ArrayLinearSearch {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
        int toFind;


        System.out.print("There are " + orderNumbers.length);
        System.out.println(" orders in the database.");

        System.out.print("Orders: ");
        for (int num : orderNumbers ) {
            System.out.print( num + "  " );
        }
        System.out.println();

        System.out.print("Which order to find? ");
        toFind = keyboard.nextInt();

        for (int num : orderNumbers ) {
            if ( num == toFind ) {
                System.out.println( num + " found.");
            }
            else {
                System.out.println("Order number not found");
            }
            break;
        }
    }
}

/*
We created an int called num inside both for each loops. Could we have just declared the variable
once up on line 7 and then removed the word int from both loops? Try it and see.
 */
// Get bad intiliazer for for-loop

/*
Try to change the code so that if the order number is not found, it prints out a single message saying so.
This is tricky. Even if you aren’t successful, give it a good effort before moving on to the next exercise.
(Mr. Mitchell’s real-life students don’t need to get this working to get credit, but they must try.)
 */

// Done!