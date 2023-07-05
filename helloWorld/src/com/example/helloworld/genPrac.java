package com.example.helloworld;

import java.util.Scanner;

class Current{
    public double freedomIndex ;
    public double gdpPerCapita ;
//    void public double getGdpPerCapita(){
//        return gdpPerCapita ;
//    }
//    void public double getFreedomIndex(){
//        return freedomIndex ;
//    }
    void setFreedomIndex( double freedomIndex ){
        this.freedomIndex = freedomIndex ;
    }
    void setGdpPerCapita( double gdpPerCapita ){
        this.gdpPerCapita = gdpPerCapita ;
    }
    public double newFunc( int i ) throws Exception{
        System.out.println("how are you ?");
        double var = (gdpPerCapita+freedomIndex)/2 ;
        return var ;
    }

}

class newClass extends Current {
    public double newFunc(int i ) throws Exception{
        System.out.println("this country's freedom index is: " + freedomIndex);
        System.out.println("this country's gdp per capita is: " + gdpPerCapita );
        double var1 = (gdpPerCapita-freedomIndex)/2 ;
        return var1 ;
    }
}

public class genPrac {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in ) ;
        Current curr =  new Current() ;


    }

}
