/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBMProject;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author rrafs
 */
public class ConnectionProvider {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbmsp","root","abdarahmrrr");
            return con;
        }
        catch(Exception e){return null;}
    }
}
