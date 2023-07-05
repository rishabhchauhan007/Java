package jdbcTest;//package jdbcTest;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.* ;
public class test {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root" ;
            String password = "password" ;

            Connection con = DriverManager.getConnection(url,username,password) ;
            if( con.isClosed() ){
                System.out.println("Connection is closed") ;
            }
            else{
                System.out.println("Connection started....") ;
            }
            String q = "CREATE TABLE TABLE3(tID INT(20) PRIMARY KEY , TNAME VARCHAR(200) NOT NULL , TCITY VARCHAR(400) )" ;
            Statement stmt = con.createStatement() ;
            stmt.executeUpdate(q) ;
            System.out.println("table created in youtube") ;
            con.close() ;
        }
        catch( Exception e ){
            e.printStackTrace() ;
        }
    }
}
