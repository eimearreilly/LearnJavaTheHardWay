/**
 * Created by eimearreilly on 25/01/2017.
 */

public class ex6_MathOperations {
    public static void main(String [] args){
        int a,b,c,d,e,f,g;
        double x,y,z;
        String one, two, both;

        a = 10;
        b=27;
        System.out.println("a is " +a+ ", b is "+b);

        c = a + b;
        System.out.println( "a+b is " + c );
        d = a - b;
        System.out.println( "a-b is " + d );
        e = a+b*3;
        System.out.println( "a+b*3 is " + e );
        f = b / 2;
        System.out.println( "b/2 is " + f );
        g = b % 10;
        System.out.println( "b%10 is " + g );

        x = 1.1;
        System.out.println( "\nx is " + x );
        y = x*x;
        System.out.println( "x*x is " + y );
        z = b / 2;
        System.out.println( "b/2 is " + z );
        System.out.println();

        one = "dog";
        two = "house";
        both = one + two;
        System.out.println( both );

        /*
        Add two new variables to the program (integers, doubles or one of each).
        Then add two new lines where you initialize those new variables using mathematical expressions.
        Make sure you use each mathematical operator at least once. Put all this down below all the existing code.
         */

        int int1;
        double doub2;

        int1 = 10;
        doub2 = 3.5;

        System.out.println(int1 - doub2);
        System.out.println(int1 + doub2);
        System.out.println(int1 * doub2);
        System.out.println(int1 / doub2);


    }
}
