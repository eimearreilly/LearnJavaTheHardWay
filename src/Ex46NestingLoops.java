/**
 * Created by eimearreilly on 31/01/2017.
 */
public class Ex46NestingLoops {
    public static void main(String[] args){
        // This is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c='A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");
        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ ) {
            for ( int b=1; b <= 3; b++ ) {
                System.out.println( "(" + a + "," + b + ") " );
            }
            // * You will add a line of code here.
            //System.out.println("(" + a + "," + b + ") " );
        }
        System.out.println("\n");
    }

}

// The numbers change faster
// The outer loop controls the letters
// When you change the order of the loops it becomes:
/*
A 1
B 1
C 1
D 1
E 1
A 2
B 2
C 2
D 2
E 2
A 3
B 3
C 3
D 3
E 3
 */
// changing to println results in the numbers being printed in a column
// It doens't output as b is outside the loop