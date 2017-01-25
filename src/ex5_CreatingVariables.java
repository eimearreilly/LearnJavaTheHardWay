/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex5_CreatingVariables {
    public static void main(String[] args){
        int x,y,age;
        double seconds, e, checking;
        String firstName, lastName, title;

        x=10;
        y=400;
        age=39;

        seconds = 4.71;
        e = 2.71828182845904523536;
        checking = 1.89;

        firstName="Graham";
        lastName = "Mitchell";
        title= "Mr";

        System.out.println("The variable x contains x " + x);
        System.out.println( "The value " + y + " is stored in the variable y." );
        System.out.println( "The experiment took " + seconds + " seconds." );
        System.out.println( "A favorite irrational # is Euler's number: " + e );
        System.out.println( "Hopefully you have more than $" + checking + "!" );
        System.out.println( "My name's " + title + " " + firstName + lastName );

        /*
        Add four more variables to the program: another integer, another double, and two Strings.
         Name them whatever you want. Give them values. Print them out.
         */

        int myAge = 24;
        double myHeight = 5.3;
        String myfirstName = "Eimear";
        String mySurname = "Reilly";

        System.out.println("My name is " + myfirstName + " and my surname is " + mySurname+ ". I am " + myHeight+" in height and am "+ myAge +" years old.");
    }
}
