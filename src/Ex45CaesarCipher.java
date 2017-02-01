/**
 * Created by eimearreilly on 31/01/2017.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.nio.charset.*;
import java.nio.file.*;
import java.io.IOException;
import java.io.*;



public class Ex45CaesarCipher {

    /**
     * Returns the character shifted by the given number of letters.
     */

    /*

     */
    public static char shiftLetter( char c, int n ) {
        int u=c;
        if ( ! Character.isLetter(c) )
            return c;

        u=u+n;
        if ( Character.isUpperCase(c) && u > 'Z' || Character.isLowerCase(c) && u > 'z' ) {
            u -= 26;
        }
        if ( Character.isUpperCase(c) && u < 'A' || Character.isLowerCase(c) && u < 'a' ) {
            u += 26;
        }
        return (char)u; }

    // Simple method that imports txt file

    public static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main( String[] args ) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String filename = "some-words.txt";
        File f = new File(filename);
        if (f.exists() && f.length() > 0){
            Scanner input = new Scanner(f);

        }
        String plaintext = readFile("some-words.txt", Charset.defaultCharset());
        System.out.println("Message: " + plaintext);

        String cipher = "";
        int shift;
        System.out.print("Shift (0-26): ");
        shift = keyboard.nextInt();
        for (int i = 0; i < plaintext.length(); i++) {
            cipher += shiftLetter(plaintext.charAt(i), shift);
        }
        System.out.println(cipher);

        // Save ciphertext into a file
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( "cipher-msg.txt"));
            writer.write( cipher);

        }
        catch ( IOException e)
        {
        }
        finally
        {
            try
            {
                if ( writer != null)
                    writer.close( );
            }
            catch ( IOException e)
            {
            }
        }
    }
}
