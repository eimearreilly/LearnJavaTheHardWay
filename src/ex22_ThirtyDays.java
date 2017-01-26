import java.util.Scanner;

/**
 * Created by eimearreilly on 26/01/2017.
 */

/*
1. Remove some of the break statements in the first switch and add someprintln() statements to confirm that
it will set monthName to one value, then another, and yet another until it finally gets stopped by a break.
 */


public class ex22_ThirtyDays {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int month, days;
        String monthname;

        System.out.print("Which month? (1-12) ");
        month = keyboard.nextInt();

        switch (month){
            case 1: monthname = "January";
                System.out.println(monthname);
            case 2: monthname = "February";
                System.out.println(monthname);
            case 3: monthname = "March";
                System.out.println(monthname);
            case 4: monthname = "April";
                break;
            case 5: monthname = "May";
                break;
            case 6: monthname = "June";
                break;
            case 7: monthname = "July";
                break;
            case 8: monthname = "August";
                break;
            case 9: monthname = "September";
                break;
            case 10: monthname = "October";
                break;
            case 11: monthname = "November";
                break;
            case 12: monthname = "December";
                break;
            default: monthname = "error";
        }

        /* Thirty days hath September
            April, June and November
            All the rest have thirty-one
            Except the second month alone....
        */


        switch (month){
            case 9:
            case 4:
            case 6:
            case 11: days = 30;
                break;
            case 2: days = 28;
                break;
            default: days = 31;
        }
        System.out.println(days + " days hath " + monthname);
    }
}
