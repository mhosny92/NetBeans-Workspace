package forms_package;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nadun
 */
public class DBClass {

    static private Connection  connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/school_app", "root", "P@ssw0rd");
        }
        return connection;
    }

}
