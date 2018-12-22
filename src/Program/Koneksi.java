package Program;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author RAMA
 */
public class Koneksi {
 public static Connection getConnection(){
        Connection koneksi = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasbesarpbo","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        return  koneksi;
 }
}
