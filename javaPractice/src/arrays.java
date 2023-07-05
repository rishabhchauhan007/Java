import java.io.BufferedReader;
import java.util.*;

public class arrays {

//    static void func( int arr[] , int n ){
////        if( n < 2 ){
////            System.out.println("input not long enough");
////            return ;
////        }
////        int i , largest , second ;
////        largest = second = Integer.MIN_VALUE ;
////        for( i = 0 ; i < n ; i++ ){
////            if( largest < arr[ i ] ){
////                second = largest ;
////                largest = arr[ i ] ;
////            }
////            else if( arr[ i ] > second && arr[ i ] != largest ){
////                second = arr[ i ] ;
////            }
////        }
////        System.out.println(second );
//        int first , second , third ;
//        if( n < 3 ){
//            System.out.println("wrong input");
//            return ;
//        }
//        first = second = third = Integer.MIN_VALUE ;
//        for( int i = 0 ; i < n ; i++ ){
//            if( arr[ i ] > first ){
//                third = second ;
//                second = first ;
//                first = arr[ i ] ;
//            }
//            else if( arr[ i ] > second ){
//                third = second ;
//                second = arr[ i ] ;
//            }
//            else if( arr[ i ] > third ){
//                third = arr[ i ] ;
//            }
//        }
//        System.out.println(first + "," + second + "," + third );


//        for( i = 0 ; i < n ; i++ ){
//            largest = Math.max( largest , arr[i] ) ;
//        }
//        for( i = 0 ; i < n ; i++ ){
//            if( arr[ i ] != largest ){
//                second = Math.max( second , arr[ i ] ) ;
//            }
//        }
//        System.out.println("the second largest element is:" + second );
//    }

//    static void zeroesMove(int a[], int n){
//        int count = 0 , i ;
//        for( i = 0 ; i < n ; i++ ){
//            if( a[ i ] != 0 ){
//                a[ count ] = a[ i ] ;
//            }
//        }
//        while( count < n ){
//            a[ count ] = 0 ;
//            count++ ;
//        }
//
//    }

    public static void main(String[] args) {
        // find the second largest element in the array
        Scanner scn = new Scanner( System.in ) ;
        System.out.println("enter size of the array");
        int n = scn.nextInt() ;
        System.out.println("input the elements of the array");
        int[] arr = new int[ n ] ;
        for( int i = 0 ; i < n ; i++ ){
            arr[ i ] = scn.nextInt() ;
        }
        int count = 0 , i ;
        for( i = 0 ; i < n ; i++ ){
            if( arr[ i ] != 0 ){
                arr[ count++ ] = arr[ i ] ;
            }
        }
        while( count < n ){
            arr[ count ] = 0 ;
            count++ ;
        }
//        zeroesMove( arr , n ) ;
        for( int num : arr ){
            System.out.print( num + " " );
        }
//        func( arr , n ) ;
//        int max_el = arr[ 0 ] ;
//        for( int num : arr ){
//            if( num > max_el ){
//                max_el = num ;
//            }
//        }
//        int sec_max = arr[ 0 ] ;
//        for( int num : arr ){
//            if( num > sec_max && num < max_el ){
//                sec_max = num ;
//            }
//        }
//        System.out.println(sec_max);
//        int biggest = arr[ 0 ] ;
//        int second_biggest = 0 ;
//        for( int num : arr ){
//            second_biggest = biggest ;
//            if( biggest > num ){
//                biggest = num ;
//            }
//        }
//        System.out.println(second_biggest);
//        List<Integer> l = new ArrayList<>( Arrays.asList(5,245,241,7534,1242,2126,3456) ) ;
//        Set<Integer> s = new TreeSet<>(l) ;
//        l.clear();
//        for( int num : s ){
//            l.add(num) ;
//        }
//        int n = l.size() ;
//        System.out.println("second greatest element is " + l.get( n - 2 ));

//        Arrays.sort( arr ) ;
//        System.out.println("second largest element in the array is: " + arr[ n - 2 ]);

    }
}
