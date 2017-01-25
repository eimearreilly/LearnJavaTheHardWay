import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */


/*
Add some variables and change the program so that the human can input their weight and height using pounds and inches,
and then convert those values to kilograms and meters to figure the BMI.

Make it so the human can input their height in feet and inches separately.

 */
public class ex9_BMICalculator {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        double m, feet, inch, kg, lbs, bmi;
        System.out.print("Your height (feet only) : ");
        feet = keyboard.nextDouble();

        System.out.print("Your height (inches) : ");
        inch = keyboard.nextDouble();

        System.out.print("Your weight in pounds: ");
        lbs = keyboard.nextDouble();

        // 1 foot = 0.3048 metres
        // 1 inch = 0.0254 metres
        // 1 lb = 0.453592 kg

        kg = lbs*0.453592;
        m = ((inch*0.0254) + (feet*0.3048));

        bmi = kg/(m*m);

        System.out.println("Your BMI is "+bmi);
    }
}
