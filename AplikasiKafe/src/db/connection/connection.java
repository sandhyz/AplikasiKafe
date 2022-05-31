package db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {

    public static final String db_url = "jdbc:mysql://localhost/db_kafe?useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String user = "root";
    public static final String pass = "";
    public Connection conn;

    public Connection koneksi() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(db_url, user, pass);
            return this.conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan! : " + e.getMessage());
        }
        return null;
    }

}

