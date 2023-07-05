import java.util.Scanner;
import java.util.Vector;

public class collectionsPrac {
    public static void main(String[] args) {
        int n = 10 ;
        Scanner scn = new Scanner( System.in ) ;
        Vector<Integer> v = new Vector<>() ;
        for( int i = 0 ; i < n ; i++ ){
            int num = scn.nextInt() ;
            v.add( num ) ;
        }
        System.out.println( v.capacity() );
        System.out.println( v );
//        for( int nu : v ){
//            System.out.print(nu + " ");
//        }
        System.out.println( v.get( 4 ));
        v.add( 4 , 900 ) ;
        System.out.println( v.get( 4 ) );
        v.clear();
        System.out.println( v );


    }
}
