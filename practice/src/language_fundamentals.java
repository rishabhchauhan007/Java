import java.util.ArrayList;
import java.util.Scanner;

public class language_fundamentals {
    public static void main(String[] args) {
//        int string = 10 ;
//        System.out.println(string);
        String[][] a = new String[4][];
        Scanner scn = new Scanner( System.in) ;
        for( int i = 0 ; i < a.length ; i++ ){
            System.out.println("input size of a[" + i + "]");
            int n = scn.nextInt() ;
            a[ i ] = new String[n] ;
            System.out.println("enter elements of a[" + i + "]");
            for( int j = 0 ; j < n ; j++ ){
                String strk = scn.next() ;
                a[ i ][ j ] = strk ;
            }
        }
//        for( int i = 0 ; i < 4 ; i++ ){
//            for( int j = 0 ; j < a[ i ].length ; i++ ){
//                System.out.println( a[ i ][ j ] );
//            }
//        }
        for( int i = 0 ; i < 4 ; i++ ){
            for( String str : a[ i ] ){
                System.out.println( str );
            }
        }
    }
}
