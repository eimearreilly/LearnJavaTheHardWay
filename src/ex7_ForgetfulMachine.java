/**
 * Created by eimearreilly on 25/01/2017.
 */
import java.util.Scanner;

public class ex7_ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France?");
        keyboard.next();

        System.out.println("What is 6 multiplied by 7?");
        keyboard.nextInt();
        // The 2nd question blows up when I type a string.

        System.out.println("Enter a number between 0.0 and 1.0.");
        keyboard.nextDouble();
        // The 2nd question blows up when I type a non-double i.e. a string.”

        System.out.println("Is there anything else you would like to say?");
        keyboard.next();
    }
    /*
    Type something different that makes the program blow up on the second question.
    What did you type? Put a comment at the bottom of the code saying something like
    “// The 2nd question blows up when I type [BLANK].”
    Type something that makes the program blow up on the third question.
    What did you type? Put another comment at the bottom of the code explaining what value blew it up and why.
     */
}