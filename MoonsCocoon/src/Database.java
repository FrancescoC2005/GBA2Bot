import java.sql.*;

class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "http://localhost:8081/phpmyadmin/index.php?route=/database/structure&db=moonscocoon";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }
    public static MobileSuit Select(String nome) throws SQLException{
        String url = "http://localhost:8081/phpmyadmin/index.php?route=/database/structure&db=moonscocoon";
        String username = "root";
        String password = "password";
        String query = "select* from MobileSuit where nome=";
        Connection con = DriverManager.getConnection(
                url, username, password);
        System.out.println(
                "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query+nome); // Execute query
        rs.next();
        String name = rs.getString("Name"); // Retrieve name from db
        String desc = rs.getString("Description");;
        Integer damage= rs.getInt("Damage");
        Integer defense= rs.getInt("Defence");
        Integer speed= rs.getInt("Speed");
        Integer dash= rs.getInt("Dash");
        String dpress= rs.getString("DoublePress");
        Integer Fun= rs.getInt("Fun");
        Integer Power= rs.getInt("Power");
        System.out.println(nome); // Print result on console
        st.close(); // close statement
        con.close(); // close connection
        System.out.println("Connection Closed....");

        MobileSuit MS= new MobileSuit(name,desc,damage,defense,speed,dash,dpress,Fun,Power);
        return MS;

    }
}