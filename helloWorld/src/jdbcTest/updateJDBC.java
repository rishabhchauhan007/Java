package jdbcTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class updateJDBC {
    public static void main(String[] args) {
        try{
            Connection con = connectionProvider.getConnection() ;
            String q = "update TABLE1 set tname = ? , tcity = ? where tid = ?" ;
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in)) ;
            System.out.println("enter new name");
            String name = br.readLine() ;
            System.out.println("enter new city name");
            String city = br.readLine() ;
            System.out.println("enter the student id: ");
            int id = Integer.parseInt( br.readLine() ) ;
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            pstmt.executeUpdate() ;
            System.out.println("done......");
            con.close() ;
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
}
