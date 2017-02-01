/**
 * Created by eimearreilly on 27/01/2017.
 */

/*
Modify the code for the computer’s turn so that it will stop after 20 points or when it has earned
 enough points to win the game.
 */


import java.util.Scanner;
public class ex32_PigDice {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int roll, turnTotal, personTotal, computerTotal;
        String choice = "";
        personTotal = 0;
        computerTotal = 0;

        // Each turn a player repeatedly rolls a die until either a 1 is rolled or the player decides to "hold".

        // If the player rolls a 1, they score nothing and it becomes the next player's turn.
        do {
            // To begin with the turntotal is 0.
            turnTotal = 0;
            System.out.println(" You have " + personTotal + " points.");

            do {
                roll = 1 + (int) (Math.random() * 6);
                System.out.println("\tyou rolled a " + roll + ".");

                // Each turn a player repeatedly rolls a die until either a 1 is rolled or the player decides to "hold".
                if (roll == 1) {
                    System.out.println("\t That ends your turn.");
                    turnTotal = 0;
                } else {
                    turnTotal += roll;
                    System.out.println("\tYou have " + turnTotal + " points.");
                    System.out.print(" so far this round.\n");
                    System.out.print("\tWould you like to \"roll\" again");
                    System.out.print(" or \"hold\"? ");
                    choice = keyboard.next();
                }
            } while (roll != 1 && choice.equals("roll"));

            personTotal += turnTotal;
            System.out.println("\tYou end the round with " + personTotal + " points.");

            if (personTotal < 100) {
                turnTotal = 0;
                System.out.println("Computer has " + computerTotal + "points");

                do {
                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("\tComputer rolled a " + roll + ".");
                    if (roll == 1) {
                        System.out.println("\tThat ends its turn.");
                        turnTotal = 0;
                    } else {
                        turnTotal += roll;
                        System.out.print("\tComputer has " + turnTotal);
                        System.out.print(" points so far this round.\n");

                        if (turnTotal < 20) {
                            System.out.println("\tComputer will roll again.");
                        }
                    }

                } while (roll != 1 && turnTotal < 20);

                computerTotal += turnTotal;
                System.out.print("\tComputer ends the round with ");
                System.out.print(computerTotal + " points.\n");
            }

        } while (personTotal < 100 && computerTotal < 100);

        if (personTotal > computerTotal) {
            System.out.println("Humanity wins!");
        } else {
            System.out.println("Humanity wins!");
            // If the player rolls any other number, it is added to their turn total and the player

            // If the player chooses to "hold" their turn total is added to their score and it becomes the next player's turn

            // First play to score 100 or more wins
        }
    }
}

