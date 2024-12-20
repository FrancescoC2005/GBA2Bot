import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "http://localhost:8081/phpmyadmin/index.php?route=/database/structure&db=moonscocoon"; // replace with your database URL
        String username = "root"; // replace with your database username
        String password = "password"; // replace with your database password

        return DriverManager.getConnection(url, username, password);
    }
}