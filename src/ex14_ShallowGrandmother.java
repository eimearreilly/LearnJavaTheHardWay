import java.util.Scanner;

/**
 * Created by eimearreilly on 25/01/2017.
 */

/*
Many people have two grandmothers. Let’s pretend the other grandmother just wants you to be happy.
 Add a question “How happy do you make them?” and a variable to hold its answer.
 Then add a Boolean variable called allowed2 and write a new expression that’s
 true when the person is close to your age and makes you happy (a happiness number more than 7 out of 10).
 */

public class ex14_ShallowGrandmother {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int age;
        double income, cute, happy;
        boolean allowed, allowed_happy;

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();

        System.out.print("Enter your yearly income: ");
        income = keyboard.nextDouble();

        System.out.print("How cute are you on a scale of 1 to 10? ");
        cute = keyboard.nextDouble();

        allowed = (age>25 && age< 40 && (income > 50000 || cute>= 8.5));
        System.out.println("Allowed to date my grandchild? "+ allowed);

        // Grandmother 2
        System.out.print("How happy do you make them on a scale of 1 to 10? ");
        happy = keyboard.nextDouble();

        allowed_happy = (age>25 && age <40 && happy>7);
        System.out.println(allowed_happy);



    }
}

