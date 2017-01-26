/**
 * Created by eimearreilly on 26/01/2017.
 */
import java.util.Scanner;

public class ex23_DictionaryOrder {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print( "Make up the name of a programming language! " );
        // Note nextLine takes in multiple words unlike .next which only takes in one word
        name = keyboard.nextLine();

         if ( name.compareTo("c++") < 0 )
             System.out.println( name + " comes BEFORE c++" );
         if ( name.compareTo("c++") == 0 )
             System.out.println( "c++ isn't a made-up language!" );
         if ( name.compareTo("c++") > 0 )
             System.out.println( name + " comes AFTER c++" );
         if ( name.compareTo("go") < 0 )
             System.out.println( name + " comes BEFORE go");
         if ( name.compareTo("go") == 0 )
             System.out.println( "go isn't a made-up language!" );
         if ( name.compareTo("go") > 0 )
             System.out.println( name + " comes AFTER go" );
         if ( name.compareTo("java") < 0 )
             System.out.println( name + " comes BEFORE java" );
         if ( name.compareTo("java") == 0 )
             System.out.println( "java isn't a made-up language!" );
         if ( name.compareTo("java") > 0 )
             System.out.println( name + " comes AFTER java" );
         if ( name.compareTo("lisp") < 0 )
             System.out.println( name + " comes BEFORE lisp" );
         if ( name.compareTo("lisp") == 0 )
             System.out.println( "lisp isn't a made-up language!" );
         if ( name.compareTo("lisp") > 0 )
             System.out.println( name + " comes AFTER lisp" );
         if ( name.compareTo("python") < 0 )
             System.out.println( name + " comes BEFORE python" );
         if ( name.compareTo("python") == 0 )
             System.out.println( "python isn't a made-up language!" );
         if ( name.compareTo("python") > 0 )
             System.out.println( name + " comes AFTER python" );
         if ( name.compareTo("ruby") < 0 )
             System.out.println( name + " comes BEFORE ruby" );
         if ( name.compareTo("ruby") == 0 )
             System.out.println( "ruby isn't a made-up language!" );
         if ( name.compareTo("ruby") > 0 )
             System.out.println( name + " comes AFTER ruby" );
         if ( name.compareTo("visualbasic") < 0 )
             System.out.println( name + " comes BEFORE visualbasic" );
         if ( name.compareTo("visualbasic") == 0 )
             System.out.println( "visualbasic isn't a made-up language!" );
         if ( name.compareTo("visualbasic") > 0 )
             System.out.println( name + " comes AFTER visualbasic" );
         }

}

