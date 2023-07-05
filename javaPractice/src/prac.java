import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Stack;

//class Student{
//    String name ;
//    int rollNo ;
//
//    Student(String name , int rollNo){
//        this.name = name ;
//        this.rollNo = rollNo ;
//    }
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public void setRollNo(int rollNo) {
////        this.rollNo = rollNo;
////    }
//}


public class prac {
    public static void main(String[] args) {

        Scanner scn = new Scanner( System.in ) ;
        int n = scn.nextInt() ;
        int []a = new int[ n ] ;
        for( int i = 0 ; i < n ; i++ ){
            a[ i ] = scn.nextInt() ;
        }
        int j = -1 ;
        for( int i = 0 ; i < n ;i++ ){
            if( a[ i ] < 0 ){
                j++ ;
                int temp = a[ i ] ;
                a[ i ] = a[ j ] ;
                a[ j ] = temp ;
            }
        }
        


        // balanced parenthesis
//        Stack<Integer> s = new Stack<>() ;
//        Scanner scn = new Scanner( System.in ) ;
//        int n = scn.nextInt() ;
//        ArrayList<Character> ar = new ArrayList<>(n) ;
//        for( int i = 0 ; i < n ; i++ ){
//            char currChar = scn.next().charAt( 0 ) ;
//            ar.add( currChar ) ;
//        }

    }
//        Scanner scn = new Scanner( System.in ) ;
//        int n = scn.nextInt() ;
//        Student[] a = new Student[n] ;
//        for( int i = 0 ; i < n ; i++ ){
//            a[ i ] = new Student("rishabh" , i ) ;
//        }
//        Scanner scn = new Scanner( System.in ) ;
//        int n = scn.nextInt() ;
//        int []a = new int[ n ] ;
//        for( int i = 0 ; i < n ; i++ ){
//            a[ i ] = scn.nextInt() ;
//        }
//        int j = 0 ;
//        for( int i = 0 ; i < n ; i++ ){ ;
//            if( a[ i ] % 2 != 0 ){
//                swap( a , i , j ) ;
//                j++ ;
//            }
//        }
//        for( int num : a ){
//            System.out.print( num + " " );
//        }
//    }
//
//    static void swap( int []a , int i , int j ){
//        int temp = a[ i ] ;
//        a[ i ] = a[ j ] ;
//        a[ j ] = temp ;
//    }
}
