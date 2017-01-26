import java.util.Scanner;

/**
 * Created by eimearreilly on 26/01/2017.
 */
public class ex21_GenderTitles {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String title;

        System.out.print( "First name: " );
        String first = keyboard.next();
        System.out.print( "Last name: " );
        String last = keyboard.next();
        System.out.print( "Gender (M/F): " );
        String gender = keyboard.next();
        System.out.print( "Age: " );
        int age = keyboard.nextInt();
        if ( age < 20 ) { title = first;
        } else {
            if (gender.equals("F")) {
                System.out.print("Are you married, " + first + "? (Y/N): ");
                String married = keyboard.next();
                if (married.equals("Y")) {
                    title = "Mrs.";
                } else {
                    title = "Ms.";
                }
            } else {
                title = "Mr.";
            }
        }
        System.out.println("\n" + title + " " + last);


    }
}


// Changing else on line 29 to if means that the programme doesn't compile anymore
