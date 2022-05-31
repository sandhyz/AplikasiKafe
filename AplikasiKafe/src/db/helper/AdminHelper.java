package db.helper;

import classes.admin;
import db.connection.connection;
import hashing.BCrypt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminHelper extends connection {

    public admin select_data_with_username(admin adm) {

        String query = "SELECT * FROM ADMIN WHERE USERNAME= ?";

        try {
            admin adm_result = new admin();

            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            koneksi.setString(1, adm.getUsername());
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                adm_result.setId_user(rs.getString("id_admin"));
                adm_result.setUsername(rs.getString("username"));
                adm_result.setPassword(rs.getString("password"));
            }
            return adm_result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada = " + e);
        }
        return new admin();
    }
    
    public boolean edit_data(admin adm) {

        String query = "UPDATE ADMIN SET USERNAME=(?), PASSWORD=(?) WHERE ID_ADMIN = 'ADM001'";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            String pass = adm.getPassword();
            String hass = BCrypt.gensalt();

            koneksi.setString(1, adm.getUsername());
            String passhass = BCrypt.hashpw(pass, hass);
            koneksi.setString(2, passhass);

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -2) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + ex);
        }
        return false;
    }

}

