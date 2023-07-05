package com.example.helloworld;

import java.util.Scanner;
import java.util.StringTokenizer;

class HelloWorld{

    public static void stringMethod( String s1 ){
        s1 = s1 + "forgeeks" ;
    }

    public static void stringBuildMethod( StringBuilder s2 ){
        s2.append("forgeeks(S2)") ;
    }

    public static void stringBuffMethod( StringBuffer s3 ){
        s3.append("forGeeksS3") ;
    }

    public static void main(String[] args) {
//        Scanner scn = new Scanner( System.in ) ;
//        int x = scn.nextInt() ;
        String s1 = "geeks";
        s1 = s1 + "rishabh" ;
        System.out.println( s1 );
        stringMethod( s1 );
        System.out.println("string:" + s1 );
        StringBuilder s2 = new StringBuilder("Geeks") ;
        stringBuildMethod( s2 ) ;
        System.out.println("stringbuilder method: " + s2 );
        StringBuffer s3 = new StringBuffer("Geeks") ;
        stringBuffMethod( s3 );
        System.out.println("stringbuffer method: " + s3 );
        Scanner sc = new Scanner( System.in ) ;
        StringBuffer s9 = new StringBuffer( sc.nextLine() ) ;
        s9.append( sc.nextLine() ) ;
        System.out.println(s9);
        s9.append( "civils" ) ;
        StringBuffer revstr = s9.reverse() ;
        System.out.println(revstr);
        int capacity = revstr.capacity() ;
        System.out.println(capacity);
        StringTokenizer stz = new StringTokenizer( sc.nextLine() ) ;
        while(stz.hasMoreTokens()){
            System.out.println(stz.nextElement());
        }
        StringTokenizer stz1 = new StringTokenizer( "even:though:the:commission dedicated", ":" ) ;
        while( stz1.hasMoreTokens() ){
            System.out.println( stz1.nextElement() );
        }
        StringTokenizer stz2 = new StringTokenizer( "even:though the:commission:is:dedicated",":",true) ;
        while( stz2.hasMoreTokens() ){
            System.out.println( stz2.nextElement() ) ;
        }
    }
}