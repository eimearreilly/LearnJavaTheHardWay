/**
 * Created by eimearreilly on 26/01/2017.
 */
import java.util.Scanner;

public class ex23_DictionaryOrder {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print( "Make up the name of a programming language! " );
        name = keyboard.nextLine();

         if ( name.compareTo("c++") < 0 )
             System.out.println( name + " comes BEFORE c++" );
         if ( name.compareTo("c++") == 0 )
             System.out.println( "c++ isn't a made-up language!" );
         if ( name.compareTo("c++") > 0 )
             System.out.println( name + "

                 if ( name.compareTo("go") < 0 )
             System.out.println( name + "
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
}}

