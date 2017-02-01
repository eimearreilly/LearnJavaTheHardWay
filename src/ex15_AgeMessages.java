import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex15_AgeMessages {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.println( "You are: " );

        /*
        For each if statement, add another if statement that says the opposite. Forexample,
        if their age is greater than or equal to 13, say “old enough to create a Facebook account” When you are done,
        your program should show six messages every time no matter what age you enter.
         */

        if ( age < 13 ) {
            System.out.println( "\ttoo young to create a Facebook account" );
        }
        if (age > 13) {
            System.out.println("\table to create a Facebook account");
        }
        if ( age < 16 ) {
            System.out.println( "\ttoo young to get a driver's license" );
        }
            if ( age > 16 ) {
                System.out.println( "\tnot too young to get a driver's license" );
            }
        if ( age < 18 ) {
            System.out.println( "\ttoo young to get a tattoo" );
        }
            if ( age > 18 ) {
                System.out.println( "\tnot too young to get a tattoo" );
            }

            if ( age < 21 ) {
            System.out.println( "\ttoo young to drink alcohol" );
        }
            if ( age > 21 ) {
                System.out.println( "\tnot too young to drink alcohol" );
            }
        if ( age < 35 ) {
            System.out.println( "\ttoo young to run for President of the U.S." );
            System.out.println( "\t\t(How sad!)" );
        }
            if ( age > 35 ) {
                System.out.println( "\told enough to run for President of the U.S." );
                System.out.println( "\t\t(How exciting!)" );
            }
/*
Add one more if statement comparing their age to 65. If their age is greater than or equal to 65, say “You are old enough to retire!”.
 */
            if (age >= 65){
            System.out.println("You are old enough to retire!");
        }
            if (age >= 65){
                System.out.println("You are not old enough to retire!");
            }
}}

// If you type an age greater than 35 the only thing that gets printed is; "You are: "
