import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex12BooleanExpressions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean a,b,c,d,e,f;
        double x,y;

        System.out.print("Given me two numbers. First: ");
        x = keyboard.nextDouble();
        System.out.print("Second: ");
        y = keyboard.nextDouble();

        a=(x<y);

        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x >  y);
        f = (x >= y);

        System.out.println( x + " is LESS THAN " + y + ": " + a );
        System.out.println( x + " is LESS THAN / EQUAL TO " + y + ": " + b );
        System.out.println( x + " is EQUAL TO " + y + ": " + c );
        System.out.println( x + " is NOT EQUAL TO " + y + ": " + d );
        System.out.println( x + " is GREATER THAN " + y + ": " + e );
        System.out.println( x + " is GREATER THAN / EQUAL TO " + y + ": " + f );
        System.out.println();

        System.out.println( !(x < y) + " " + (x >= y) );
        System.out.println( !(x <= y) + " " + (x > y) );
        System.out.println( !(x == y) + " " + (x != y) );
        System.out.println( !(x != y) + " " + (x == y) );
        System.out.println( !(x > y) + " " + (x <= y) );
        System.out.println( !(x >= y) + " " + (x < y) );

        // greater than or equal to is blah blah
    }
}
