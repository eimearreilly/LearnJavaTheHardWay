/**
 * Created by eimearreilly on 25/01/2017.
 */
public class ex17_ClubBouncer {
    public static void main(String[] args){
        int age = 22;
        boolean onGuestlist = false;
        double allure = 7.5;
        String gender = "F";

        if (onGuestlist || age>= 21 || (gender.equals("F") && allure >= 8)){
            System.out.println("You are allowed to enter the club");
        }
        else{
            System.out.println("You ain't gettin into the club yo");
        }
    }
}

// Doesn't compile because the else is without an if