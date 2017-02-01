/**
 * Created by eimearreilly on 01/02/2017.
 */

import java.util.Scanner;
import java.io.*;

class TemperatureSample{
    int month, day, year;
    double temp;
}

public class Ex56TemperatureSample {
    public static void main(String[] args) throws Exception {
        //String site = "https://learnjavathehardway.org";
        //String path = "/txt/avg-daily-temps-with-dates-atx.txt";
        //Scanner inFile = new Scanner((new java.net.URL(site+path)).openStream());

        // Read in the locally saved dublin.txt file
        Scanner inFile = new Scanner(new File("dublin.txt"));

        TemperatureSample[] tempDB = new TemperatureSample[10000];
        int numRecords, i=0;

        while (inFile.hasNextInt() && i < tempDB.length){
            TemperatureSample e = new TemperatureSample();
            e.month = inFile.nextInt();
            e.day = inFile.nextInt();
            e.year = inFile.nextInt();
            e.temp = inFile.nextDouble();

            if( e.temp == -99)
                continue;
            tempDB[i] = e;
            i++;
        }
        inFile.close();
        numRecords = i;

        System.out.println(numRecords + " daily temps loaded.");

        double total = 0, avg;
        int count = 0;
        for (i=0; i<numRecords; i++){
            if( tempDB[i].month == 11){
                total += tempDB[i].temp;
                count++;
            }
        }

        avg = total/count;
        avg = roundToOneDecimal(avg);
        System.out.print("Avg daily temp over "+count);
        System.out.println(" days in Nov: "+avg);

        // Find the highest temperature in June in Dublin
        int maxLoc = 0;
        for (i=0; i<numRecords; i++){
            if(tempDB[i].month ==6){
                if (tempDB[i].temp > tempDB[maxLoc].temp)
                    maxLoc = i;
            }
        }
        System.out.print("Highest daily temp in June was: "+fToC(tempDB[maxLoc].temp)+" celsius.");

        TemperatureSample ts = tempDB[1];
        System.out.println( ts.toString() );
        // This doesn't work?!
    }
    public static double roundToOneDecimal(double d){
        return Math.round(d*10)/10.0;
    }
    public static double fToC( double f ) {
        return (f-32)*5/9;
    }
}

