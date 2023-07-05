//package jdbcTest;
//
//public class jdbc_insertion {
//}
package jdbcTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class jdbc_insertion {
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","password");
            System.out.println("Before insert query");
            String q = "insert into TABLE1(TNAME,TCITY) values(?,?)";
            System.out.println("After insert query");
            PreparedStatement pstmt= con.prepareStatement(q);
            System.out.println("Statement created");
            //ptsmt.setString()
            pstmt.setString(1,"TARUN");
            pstmt.setString(2,"KANPUR");
            pstmt.executeUpdate();

            con.close();
        }

        catch(Exception e) {
            e.printStackTrace();
        }

    }
}