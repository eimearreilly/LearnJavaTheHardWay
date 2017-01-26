import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
Try changing around the comparison on line 22 so that "weasel" is in front of the dot
and the variable word is inside the parentheses.
Make sure that "weasel" is still surrounded by quotes and that word is not. Does it work? Yes it works

 */
public class ex13_WeaselOrNot {
    public static void  main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println("Type the word \"weasel\", please.");
        word = keyboard.next();

        yep = "weasel".equals(word);
        nope = ! word.equals("weasel");

        System.out.println("You typed what was requested: " + yep);
        System.out.println("You ignored polite instructions:" + nope);

    }
}
