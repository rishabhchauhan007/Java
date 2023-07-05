package com.example.helloworld;

import java.util.Scanner;

class Geeks {
    public String name;
    public int roll_no;

    Geeks(String newName, int newNum) {
        this.name = newName;
        this.roll_no = newNum;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj ) return true;
        if( obj == null || obj.getClass() != this.getClass() ) return false ;
        Geeks geek = ( Geeks)obj ;
        return geek.roll_no == this.roll_no;
    }

//    @Override
//    public int hashCode() {
//        return this.roll_no ;
//    }

}
public class objectClass {
    public static void main(String[] args) {
        Geeks g1 = new Geeks("rishabh" , 20193144 );
        Geeks g2 = new Geeks("rishabh" , 20193144 ) ;

        System.out.println( g1.equals( g2 ) );
        System.out.println( g1.hashCode() + " " + g2.hashCode() );
        Object obj1 = new String( "new prog ") ;
        Class c = g1.getClass() ;
        System.out.println("the class of obj1 is: " + c.getName() );
//        System.out.println(c.toString() );
//        Geeks g1 = new Geeks() ;
//        System.out.println();
    }

}
