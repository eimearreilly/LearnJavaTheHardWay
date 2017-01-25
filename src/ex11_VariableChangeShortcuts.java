/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex11_VariableChangeShortcuts {
     public static void main( String[] args ) {
      int i, j, k;
      i = 5;
        6         j = 5;
        7         k = 5;
        8         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        9         i =  i + 3;
        10         j =  j - 3;
        11         k =  k * 3;
        12         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
        13
        14         i = 5;
        15         j = 5;
        16         k = 5;
        17         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        18         i += 3;
        19         j -= 3;
        20         k *= 3;
        21         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
        22
        23         i = j = k = 5;
        24         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
        25         i += 1;
        26         j -= 2;
        27         k *= 3;
        28         System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
        29
        30         i = j = 5;
        31         System.out.println( "i: " + i + "\tj: " + j );
        32         i =+ 1; // Oops!
        33         j =- 2;
        34         System.out.println( "i: " + i + "\tj: " + j + "\n" );
        35
        36         i = j = 5;
        37         System.out.println( "i: " + i + "\tj: " + j );
        38         i++;
        39         j--;
        40         System.out.println( "i: " + i + "\tj: " + j );
        41     }
}
