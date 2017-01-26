import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex16_ComparingNumbers {
    public static void  main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double first, second;

        System.out.print("Give me two numbers. First: ");
        first = keyboard.nextDouble();
        System.out.print( "Second: " );
        second = keyboard.nextDouble();

        if ( first < second ) {
            System.out.println( first + "is LESS THAN "+second);
        }

        if ( first <= second ) {
            System.out.println( first + " is LESS THAN/EQUAL TO " + second );
        }

        if ( first == second ) {
            System.out.println(first + " is EQUAL TO" + second);
        }

        if( first >= second ){
            System.out.println(first+ " is GREATER THAN/EQUAL TO " + second);
        }

        if (first > second){
            System.out.println(first+ " is GREATER THAN " + second);
        }

        if(first != second){
            System.out.println(first+ " is GREATER THAN " + second);

        }System.out.println("Hey.");
    }
}
