/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
Does the program blow up if you enter an integer value when it is expecting you to type a double?
Put an answer in a comment at the bottom of the code, along with your guess why or why not.
Does the program blow up if you enter a numeric value (integer or double) when it is expecting a String?
Put an answer in a comment at the bottom of the code, along with your guess why or why not.
Type something that makes the program blow up on every question possible, and add comments explaining what blew it up and why.
Add a new variable of your choosing. Add another question. (It doesn’t have to be rude.)
Let the human put an answer to your question into your new variable, and display the human’s answer on the screen afterward.
 */
import java.util.Scanner;

public class ex8_RudeQuestions {

    public static void main( String[] args ) {
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? " );
        age = keyboard.nextInt();

        System.out.println( "So you're " + age + ", eh? That's not very old." );
        System.out.print( "How much do you weigh, " + name + "? " );
        weight = keyboard.nextDouble();

        System.out.println( weight + "! Better keep that quiet!!" );
        System.out.print("Finally, what's your income, " + name + "? " );
        income = keyboard.nextDouble();

        System.out.print( "Hopefully that is " + income + " per hour" );
        System.out.println( " and not per year!" );
        System.out.print( "Well, thanks for answering my rude questions, " );
        System.out.println( name + "." );

        // My question
        int siblings;
        System.out.println("How many siblings do you have?");
        siblings = keyboard.nextInt();
        System.out.println("So you have "+ siblings+ " brothers and sisters, WOW!");

    }
    // The program does not blow up if you enter an integer value when it is expecting a double
    // This is because an integer is contained in a double
    // No it does blow up if you enter a numberic value when is expecting a string because nextString isn't specified.
    // What to type to blow it up on every question

    // 1. I was unable to break the first question
    // 2. eimear (non-int)
    // 3. reilly (non-nunmeric)
    // 4. twenty euro (non-numeric)
}
