package Shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
public class DataBase {
    public Connection con;
    String qry;
    PreparedStatement pr;
    Statement sm;
    ResultSet rs;
     public DataBase(){
         String url,uname,pwd;
         try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         url="jdbc:mysql://localhost:3306/police";
         uname="rejina";
         pwd="rejina";
         con=DriverManager.getConnection(url, uname, pwd);
         }
         catch(Exception ex){
             System.out.println("Error : "+ex);
         }
     }
   

}
