/**
 * Created by eimearreilly on 27/01/2017.
 */
/*
1. Rewrite the code to use a while loop instead of a do-while loop. (It won’t compile at first.)
Add/change something before the loop starts so that it compiles and make sure it still works.
Then change it back to a do-while. (And leave in whatever you changed to make the while version compile.)
 */
import java.util.Scanner;

public class ex30_RunningTotal {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int current, total;
        total = 0;
        System.out.print("Type in a bunch of values and I'll add them up. ");
        System.out.println("I'll stop when you type a zero.");
        System.out.print("Value: ");
        current = keyboard.nextInt();

        while (current != 0) {

            total += current;
            System.out.println("The total so far is: " + total);
            System.out.print("Value: ");
            current = keyboard.nextInt();
        }
        System.out.println("The final total is: " + total);

    }
}