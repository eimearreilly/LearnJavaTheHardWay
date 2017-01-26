import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by eimearreilly on 26/01/2017.
 */

/*

1. Add extra code at the bottom to make the computer pick three random integers from 1 to 3 and
print them out on the screen.

2. Add code to pick three random integers from 5 to 10 and display them. Run the program a bunch of times to
 confirm your numbers always stay in that range.

 */

public class ex24_randomNumbers {
    public static void main(String[] args) {
        int a, b, c, d;
        double r, rps;

        rps = Math.random();
        if(rps<0.33333){
            System.out.println("ROCK!");
        }
        else if (rps <0.666667){
            System.out.println("PAPER!");
        }
        else{
            System.out.println("SCISSORS");
        }

         // pick four random integers, each 1-10
         a = 1 + (int)( 10*Math.random() );
         b = 1 + (int)( 10*Math.random() );
         c = 1 + (int)( 10*Math.random() );
         d = 1 + (int)( 10*Math.random() );
         System.out.println( "1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d );

         // pick four random integers, each 1-6
         a = 1 + (int)( 6*Math.random() );
         b = 1 + (int)( 6*Math.random() );
         c = 1 + (int)( 6*Math.random() );
         d = 1 + (int)( 6*Math.random() );

        System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );
         // pick a single random integer, 1-100
         a = 1 + (int)( 100*Math.random() );
         System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a );

         // pick four random integers, each 1-100
         a = 1 + (int)( 100*Math.random() );
         b = 1 + (int)( 100*Math.random() );
         c = 1 + (int)( 100*Math.random() );
         d = 1 + (int)( 100*Math.random() );
         System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );

         // pick four random integers, each 0-99
         a = 0 + (int)( 100*Math.random() );
         b = 0 + (int)( 100*Math.random() );
         c = (int)( 100*Math.random() );
         d = (int)( 100*Math.random() );
         System.out.println( "0-99:\t" + a +"\t" + b + "\t" + c + "\t" + d);


         // pick four random integers, each 10-20
         a = 10 + (int)( 11*Math.random() );
         b = 10 + (int)( 11*Math.random() );
         c = 10 + (int)( 11*Math.random() );
         d = 10 + (int)( 11*Math.random() );
         System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );

         // display four random doubles, each [0-1)
         System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );
         System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );

         r = 10 * Math.random();
         System.out.println( "0-9.99:\t" + r );
         System.out.println( "0-9:\t" + (int)r );
         System.out.println( "1-10:\t" + (1 + (int)r) );

        // Pick three random integers from 1 to 3 and print them out on screen
        int test1 = 0 + (int)( 3*Math.random() );
        int test2 = 0 + (int)( 3*Math.random() );
        int test3 = 0 + (int)( 3*Math.random() );
        System.out.println("0-3: \t" + test1 + "\t" + test2 + "\t" + test3);

        // Pick three random integers from 5 to 10 and display them.
        int test4 = 5 + (int)( 3*Math.random() );
        int test5 = 5 + (int)( 3*Math.random() );
        int test6 = 5 + (int)( 3*Math.random() );
        System.out.println("0-3: \t" + test1 + "\t" + test2 + "\t" + test3);
    }
}
