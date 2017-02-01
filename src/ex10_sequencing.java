import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
1. Remove the ‘ = 0 on line 8, so that *price* no longer gets defined on line 8, only declared.
What happens when you try to compile the code? Does the error message make sense? (Now put the = 0‘
back so that the program compiles again.)

2. Move the two lines of code that give values to sales Tax and total so they occur after price has been given a real value.
 Confirm that the program now works as expected.

3. Now that these lines occur after the variable price has been properly given a real value, try removing the ‘ = 0‘ on line 8 again.
Does the program still give an error? Are you surprised?
 */
public class ex10_sequencing {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        double price, salesTax, total;

        System.out.print("How much is the purchase price? ");
        price = keyboard.nextDouble();

        salesTax = price*0.0825;
        total = price + salesTax;

        System.out.println("Item price:\t" + price);
        System.out.println("Sales tax:\t" + salesTax);
        System.out.println("Total cost:\t" + total);

    }
}
