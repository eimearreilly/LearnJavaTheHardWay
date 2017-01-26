import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

/**
 * Created by eimearreilly on 26/01/2017.
 */

/*
Before you ask the person for a PIN, ask them for a password. (It should be a String.)
Then add a second while loop before the first one that loops as long as their answer is not the right password.
So after you’re done, the person must enter the correct password and then enter the correct PIN in order to see
their account balance.

Remember that you need to use .equals() when comparing Strings, and “not equals” looks like this:
( ! typedPassword.equals("hunter2") )
The exclamation point in front there means “not” or “the opposite of”.

 */
public class ex25_EnterPIN {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int pin, entry;
        pin = 12345;

        String password, guess;
        password = "test123";

        System.out.println("Welcome to the bank of java");

        System.out.println("Please enter your password: ");
        guess = keyboard.nextLine();

        while( !guess.equals(password)){
            System.out.println("Incorrect password, try again");
            System.out.println("Enter your password: ");
            guess = keyboard.nextLine();
        }



        System.out.println("Enter your PIN");
        entry = keyboard.nextInt();

        while (entry !=pin){
            System.out.println("\nIncorrect PIN, try again.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");

    }

}

