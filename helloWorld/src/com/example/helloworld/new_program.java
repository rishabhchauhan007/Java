package com.example.helloworld;

import java.util.Scanner;
public class new_program {
    static int recursion(int n){
        if( n <= 1 ) return 1 ;
        int n1 = recursion( n - 1 ) ;
        int n2 = recursion( n -2 ) ;
        return n1 + n2;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in) ;
        int n = obj.nextInt() ;
        int[] arr ;
        arr = new int[ n ] ;
        for( int i = 0 ; i < arr.length ; i++ ){
            arr[ i ] = obj.nextInt() ;
        }
        int maxNum = -10 ;
        for( int i = 0 ; i < arr.length ; i++ ){
            if( maxNum < arr[ i ] ){
                maxNum = arr[ i ] ;
            }
        }
        System.out.println( "maximum number in the array is : " + maxNum );
//        String s ;
//        int x ;
//        float k ;
//        s = obj.nextLine() ;
//        x = obj.nextInt() ;
//        k = obj.nextFloat() ;
//        System.out.println("my input string is : " + s ) ;
//        System.out.println("the input number is : " + x );
//        System.out.println("the input float is : " + k );
//        System.out.println( recursion( n ));

//        BufferedReader bfn = new BufferedReader( new InputStreamReader(System.in)) ;
//        String str = bfn.readLine() ;
//        int it = Integer.parseInt( bfn.readLine() ) ;
//        System.out.println( " my string is : " + str );
//        System.out.println( " my number is : " + it );
//        Scanner scn = new Scanner(System.in) ;
//        int n = scn.nextInt() ;
//        int[] arr;
//        arr = new int[ n ] ;
//        for( int i = 0 ; i < arr.length ; i++ ){
//            arr[ i ] = scn.nextInt() ;
//        }
//        Scanner scn = new Scanner(System.in) ;
        //input is a string( one word )
//        String str1 = scn.next() ;
//        System.out.println("my input is : " + str1);
//        String str2 = scn.nextLine() ;
//        System.out.println("my string input is : " + str2 ) ;
//        int x = scn.nextInt() ;
//        System.out.println("my input number is : " + x);
//        // input is a string( complete sentence)
//        float f = scn.nextFloat() ;
//        System.out.println("my float value is : " + f ) ;
//        int x = 5 ;
//        int y = 10 ;
//        int z = ( x  * y ) - ( y / 5 ) ;
//        String s1 = "GeeksForGeeks" ;
//        System.out.println(s1) ;
//        System.out.println("rishabh");
//        System.out.println( z ) ;
    }
}
