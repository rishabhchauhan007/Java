//package jdbcTest;
//
//public class jdbc_insertion {
//}
package jdbcTest;
import java.sql.*;
public class jdbc_insertion {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            String url = "jdbc:mysql://localhost:3306/youtube" ;
            String username = "root" ;
            String password = "password";
            Connection con = DriverManager.getConnection(url,username,password) ;
            String q = "INSERT INTO TABLE1(TNAME,TCITY) VALUES (?,?)" ;
            PreparedStatement pstmt = con.prepareStatement(q) ;
            pstmt.setString(1,"pantera");
            pstmt.setString(2,"nyc");
            pstmt.executeUpdate() ;
            System.out.println("inserted.......");
            con.close() ;
        }
        catch( Exception e ){
            e.printStackTrace();
        }


//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection con =null;
//
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","password");
//            System.out.println("Before insert query");
//            String q = "insert into TABLE1(TNAME,TCITY) values(?,?)";
//            System.out.println("After insert query");
//            PreparedStatement pstmt= con.prepareStatement(q);
//            System.out.println("Statement created");
//            //ptsmt.setString()
//            pstmt.setString(1,"Pink Floyd");
//            pstmt.setString(2,"Cali");
//            pstmt.executeUpdate();
//
//            con.close();
//        }
//
//        catch(Exception e) {
//            e.printStackTrace();
//        }

    }
}