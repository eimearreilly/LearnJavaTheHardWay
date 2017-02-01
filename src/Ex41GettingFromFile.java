import java.util.Scanner;
import java.io.File;

/**
 * Created by eimearreilly on 30/01/2017.
 */

/*
Open the text file and change the name or numbers. Save it. Then run your program again (you
don’t have to compile it again; the code hasn’t changed and it doesn’t open the file until it is run.)
 */

public class Ex41GettingFromFile {
    public static void main( String [] args) throws Exception{
        String name;
        int a,b,c,sum;

        System.out.println("Getting name and three numbers from file..");
        Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));

        name= fileIn.nextLine();
        a=fileIn.nextInt();
        b=fileIn.nextInt();
        c=fileIn.nextInt();

        fileIn.close();

        System.out.println("done.");
        System.out.println("Your name is "+name);
        sum = a+b+c;
        System.out.println(a + "+" + b + "+" + c + "=" +sum);

    }
}
