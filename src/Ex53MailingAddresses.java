/**
 * Created by eimearreilly on 01/02/2017.
 */
class Address{
    String street;
    String city;
    String state;
    int zip;
}
public class Ex53MailingAddresses {
    public static void main(String [] args){
        Address uno, dos, tres, eimear;

        uno = new Address();
        uno.street = "191 Marigold Lane";
        uno.city = "Miami";
        uno.state = "FL";
        uno.zip = 33179;

        dos = new Address();
        dos.street = "3029 Losh Lane";
        dos.city = "Crafton";
        dos.state = "PA";
        dos.zip = 15205;

        tres = new Address();
        tres.street = "2693 Hannah Street";
        tres.city = "Hickory";
        tres.state = "NC";
        tres.zip = 28601;

        // Create a fourth Address variable on line10 and change the code to put your mailing address in it. Don’t forget to print it out at the bottom.

        eimear = new Address();
        eimear.street = "Little Island";
        eimear.city = "Ardfield";
        eimear.state = "Cork";
        eimear.zip = 13;

        System.out.println( uno.street );
        System.out.println( uno.city + ", " + uno.state + " " + uno.zip );
        System.out.println( "\n" + dos.street );
        System.out.println( dos.city + ", " + dos.state + " " + dos.zip );
        System.out.println( "\n" + tres.street );
        System.out.println( tres.city + ", " + tres.state + " " + tres.zip );
        System.out.println( "\n" + eimear.street );
        System.out.println( eimear.city + ", " + eimear.state + " " + eimear.zip );
    }
}

