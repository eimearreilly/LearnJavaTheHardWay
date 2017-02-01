import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by eimearreilly on 30/01/2017.
 */
/*
 Hey, you know how to work with variables! Pick a price per gallon and put it into a double variable, then let the human enter in how many gallons of
 gas they want. Figure out the total cost. Then print the receipt to the file, but substitute their details so the file will look different depending
 on what they put in. I would remove the bars on the right side of the receipt, since making things line up would be hard.

 */
public class Ex40ReceiptRevisited {
    public static void main(String [] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many gallons did you purchase? ");
        double gal = kb.nextDouble();
        double price = 3.459;
        double total = gal*price;

        PrintWriter fileOut = new PrintWriter("receipt.txt");

        fileOut.println("+------------------------+");
        fileOut.println("|                        |");
        fileOut.println("|       CORNER STORE     |");
        fileOut.println("|                        |");
        fileOut.println("|  2017-01-30  04:48PM   |");
        fileOut.println("|                        |");
        fileOut.println("|                        |");
        fileOut.println("|  Gallons: " + gal +"   |");
        fileOut.println("|                        |");
        fileOut.println("|  Fuel total: " + total+ "|");
        fileOut.println("|                        |");
        fileOut.println("+------------------------+");
        fileOut.close();

    }
}
