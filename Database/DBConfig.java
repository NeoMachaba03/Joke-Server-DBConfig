package JokeServer.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private Connection con;

    public DBConfig() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/joke_server?autoSSL=false";
            String name = "root";
            String password = "root";
            con = DriverManager.getConnection(url,name ,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon(){
        return con;
    }
}
