/**
 * Created by eimearreilly on 31/01/2017.
 */

/*
Create a second array of Strings and use an initializer list to put several values into it.
Then add a second foreach loop to display the values from the new array on the screen, one at a time.

 */
public class Ex48ArrayIntro {

    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        String [] munster = {"Cork", "Kerry", "Waterford", "Clare", "Tipperary"};
        for (String m : munster){
            System.out.println("The counties in Munster are: " +m);
        }
        for (String p : planets) {
            System.out.println(p + "\t" + p.toUpperCase());
        }
    }
}

