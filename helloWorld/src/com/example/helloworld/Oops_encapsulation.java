package com.example.helloworld;

import java.util.Scanner ;

class Encapsulate {
    private String geekName ;
    private int geekRoll ;
    public int geekAge ;
    public String getGeekName(){
        return geekName ;
    }
    public int getGeekRoll(){
        return geekRoll ;
    }
    public int getGeekAge(){
        return geekAge ;
    }
    public void setAge( int age ){
        geekAge = age ;
    }
    public void setGeekName( String name ){
        geekName = name ;
    }
    public void setGeekRoll( int number ){
        geekRoll = number ;
    }


}

class SecurityCheck extends Encapsulate{
    private String password ;
    private String hashCode ;
    private int num ;
    public void setPassword( String code ){
        password = code ;
    }
    public void setHashcode( String hash ){
        hashCode = hash ;
    }
    public void setNum( int n ){
        int k = n + geekAge ;
        num = k ;
    }
    public int getNum(){
        return num ;
    }
    public String getPassword(){
        return password ;
    }
    public String getHashcode(){
        return hashCode ;
    }


}


public class Oops_encapsulation {
    public static void main(String[] args) {
        Scanner obj = new Scanner( System.in ) ;
        System.out.println(" enter your name ");
        String name = obj.next() ;
        System.out.println(" enter your age ");
        int age = obj.nextInt() ;
        System.out.println(" enter you roll no ");
        int roll_no = obj.nextInt( );
        Encapsulate currObj = new Encapsulate() ;
        currObj.setGeekName( name );
        currObj.setAge( age );
        currObj.setGeekRoll( roll_no );
        System.out.println( "your name is : " + currObj.getGeekName() );
        System.out.println( "your age is : " + currObj.getGeekAge() ) ;
        System.out.println( "your roll no is : " + currObj.getGeekRoll() );
        SecurityCheck sec = new SecurityCheck() ;
        sec.setNum( 10 );
        sec.setHashcode("aKAR4715@RiGhT");
        sec.setPassword("rishabh3523");
        System.out.println( " this is the security check number : " + sec.getNum() );
        System.out.println( " this is the security check password : " + sec.getPassword() );
        System.out.println( " this is the security check number : " + sec.getHashcode() );
    }
}