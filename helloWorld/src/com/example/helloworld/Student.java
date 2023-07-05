package com.example.helloworld;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student {
    public String stu_name ;
    public String stu_address ;
    public int stu_roll ;

    public static void main(String[] args) {
        Student s = new Student() ;
        s.stu_name = "rishabh" ;
        s.stu_roll = 1 ;
        s.stu_address = "shalimar_bagh" ;
        try{
            FileOutputStream fileout = new FileOutputStream("s.text") ;
            ObjectOutputStream out = new ObjectOutputStream(fileout) ;
            out.writeObject(s);
            out.close();
            fileout.close();
            System.out.println("object serialized and saved in s.text");
        }
        catch( IOException i ){
            i.printStackTrace();
        }
    }
}
