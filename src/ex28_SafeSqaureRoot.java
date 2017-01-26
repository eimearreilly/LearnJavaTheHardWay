/**
 * Created by eimearreilly on 26/01/2017.
 */
/*
Using loops for error-checking

1. Add another input protection loop toward the top of the program.
Ask them “Are you ready?!?” and don’t go on until they reply "YES!".
Remember to use .equals() to compare Strings and use ! for “not”.
 */

import java.util.Scanner;

public class ex28_SafeSqaureRoot {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in); double x, y;
        System.out.print("Give me a number, and I'll find its square root. ");
        System.out.println("Are you reaady");
        String readyanswer = keyboard.nextLine();

        while( !readyanswer.equals("yes")){
            System.out.println("Let me ask that again, are you ready?");
            readyanswer = keyboard.nextLine();
        }
        System.out.print("(No negatives, please.) ");
        x = keyboard.nextDouble();
        while ( x < 0 ) {
            System.out.println("I won't take the square root of a negative."); System.out.print("\nNew number: ");
            x = keyboard.nextDouble();
        }
        y = Math.sqrt(x);
        System.out.println("The square root of "+x+" is "+y);
    }
}
