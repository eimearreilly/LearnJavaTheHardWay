/**
 * Created by eimearreilly on 01/02/2017.
 */
import java.util.Scanner;
// Add a counter inside the loop that reads in all the records. After the loop is over display a message on the screen about how many records were processed.
class Actor{
    String name;
    String role;
    String birthdate;
}
public class Ex54ActorList {
    public static void main(String[] args) throws Exception {
        String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt"; // Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));

        Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
        int count = 0;
        while ( inFile.hasNext() ) {
            count++;
            Actor a = getActor(inFile);
            System.out.print(a.name + " was born on " + a.birthdate);
            System.out.println(" and played " + a.role);

        }
        System.out.println(count + " actors in total played ");
        inFile.close();
    }
    public static Actor getActor( Scanner input ) {
        Actor a = new Actor();
        a.name = input.nextLine();
        a.role = input.nextLine();
        a.birthdate = input.nextLine();

        return a;
    }

}
