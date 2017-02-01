/**
 * Created by eimearreilly on 31/01/2017.
 */

import java.util.Scanner;
import java.net.URL;

public class Ex52LowestTemp {
    public static void main(String[] args) throws Exception {
        String urlbase = "https://learnjavathehardway.org/txt/";
        double[] temps = arrayFromUrl(urlbase+ "avg-daily-temps-atx.txt");

        System.out.println( temps.length + " temperatures in database.");

        double lowest = 9999.99;

        for ( int i=0; i<temps.length; i++ ) {
            if ( temps[i] < lowest ) {
                lowest = temps[i];
            }
        }

        double highest = 0;
        for (int i=0; i<temps.length; i++)
            if( temps[i]> highest){
                highest=temps[i];
            }
        System.out.print( "The lowest average daily temperature was " );
        System.out.println( lowest + "F (" + fToC(lowest) + "C)" );

        System.out.print( "The highest average daily temperature was " );
        System.out.println( lowest + "F (" + fToC(highest) + "C)" );
    }

    public static double[] arrayFromUrl( String url ) throws Exception {
        Scanner fin = new Scanner((new URL(url)).openStream());
        int count = fin.nextInt();

        double[] dubs = new double[count];

        for ( int i=0; i<dubs.length; i++ )
            dubs[i] = fin.nextDouble();
        fin.close();
        return dubs;
    }

    public static double fToC( double f ) {
        return (f-32)*5/9;
    }
}


// Display both the lowest and avg temp and the highest