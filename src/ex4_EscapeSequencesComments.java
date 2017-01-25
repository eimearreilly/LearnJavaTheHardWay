/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
What happens if you put a block comment in the middle of the word println? Try it on line 27.
Then add a comment below line 30 saying whether or not it compiles.
Leave the block comment in line 13 if it works and take it out if it fails to compile.

Re-open the code for the previous exercise and save a copy as PrintingChoicesEscapes.java.
Rewrite it so that it has identical-looking output but only uses a single println() statement with escape sequences.
 */

public class ex4_EscapeSequencesComments {
    public static void  main(String[] args){
        // This exercise demonstrates escape sequences & comments (like these)!
        System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
        System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
        // System.out.frimp( "Learn Java the Hard Way" );
        System.out.print( "Hello\n" ); // This line prints Hello.
        System.out.print( "Jello\by\n" ); // This line prints Jelly.
        /* The quick brown fox jumped over a lazy dog.
        Quick wafting zephyrs vex bold Jim. */

        System.out /* testing */ .println( "Hard to believe, eh?" );
        System.out.println( "Surprised? /* abcde */ Or what did you expect?" );
        System.out.println( "\\ /*This is a block comment*/ // -=- \\ //" );
        System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); // it takes 2 to make 1
        System.out.print( "I hope you understand \"escape sequences\" now.\n" );
        // The class compiles


    }
}
