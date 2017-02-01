/**
 * Created by eimearreilly on 27/01/2017.
 */
public class ex31_PigDiceComputer{
    public static void main(String [] args){
        int roll, total;
        total = 0;

        do {
            roll = 1 + (int) (Math.random() * 6); // where the roll occurs
            System.out.println("Computer rolled a " + roll + ".");
            if (roll == 1) {
                System.out.println("\tThat ends it turn.");
                total = 0;
            } else {
                total += roll;
                System.out.println("\tComputer has " + total);
                System.out.println(" points so far this round.\n");
                if (total < 20) {
                    System.out.println("\tComputer will roll again.");
                }
            }
        }
            while (roll != 1 && total <20);
            System.out.println("Computer ends the round with " +total + " points.");
    }
}
