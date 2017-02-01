import java.util.Scanner;

/**
 * Created by eimearreilly on 26/01/2017.
 */
/*
Instead of making the human enter their BMI directly, allow them to
type in their height and weight and compute the BMI for them.

 */
// Remove the else from in front of the if statement on line 21.
// Run the program, and enter 15.5 for the BMI.
// Do you see how that makes the if statement on line 21 “break rank” and no longer care about
// the if statements before

    //Instead of making the human enteri their BMI directly , allow them to type in their height and weight nad compute the BMO for them
public class ex19_BMICategories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("Enter your height in m: ");
        height = keyboard.nextDouble();

        System.out.print("Enter your weight in kg: ");
        weight = keyboard.nextDouble();

        bmi = weight/(height*height);

        System.out.println("Your BMI is: " + bmi);
        System.out.print("BMI category: ");
        if (bmi < 15.0) {
            System.out.println("very severely underweight");
        } else if (bmi <= 16.0) {
            System.out.println("severely underweight");
        } else if (bmi < 18.5) {
            System.out.println("underweight");
        }  if (bmi < 25.0) {
            System.out.println("normal weight");
        } else if (bmi < 30.0) {
            System.out.println("overweight");
        } else if (bmi < 35.0) {
            System.out.println("moderately obese");
        }
        else if ( bmi < 40.0 ) { System.out.println( "severely obese" );
        }
        else {
                System.out.println( "very severely/\"morbidly\" obese" );
            }

        }
    }

