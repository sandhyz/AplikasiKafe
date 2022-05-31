package db.helper;

import classes.pegawai;
import db.connection.connection;
import hashing.BCrypt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PegawaiHelper extends connection {

     public pegawai select_data_with_username(pegawai pgw) {

        String query = "SELECT * FROM PEGAWAI WHERE USERNAME= ?";

        try {
            pegawai pgw_result = new pegawai();

            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            koneksi.setString(1, pgw.getUsername());
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                pgw_result.setId_pegawai(rs.getInt("id_pegawai"));
                pgw_result.setUsername(rs.getString("username"));
                pgw_result.setPassword(rs.getString("password"));
                pgw_result.setPrivileges(rs.getString("privileges"));
            }
            
            return pgw_result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada = " + e);
        }
        return new pegawai();
    }
    
    public List<pegawai> select_pegawai() {

        List<pegawai> lpgw = new ArrayList<>();
        String query = "SELECT * FROM PEGAWAI";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                pegawai pgw = new pegawai();

                pgw.setId_pegawai(rs.getInt("ID_PEGAWAI"));
                pgw.setUsername(rs.getString("USERNAME"));
                pgw.setPassword(rs.getString("PASSWORD"));
                pgw.setNama_pegawai(rs.getString("NAMA_PEGAWAI"));
                pgw.setPrivileges(rs.getString("PRIVILEGES"));

                lpgw.add(pgw);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }
        return lpgw;
    }

    public boolean insert_data(pegawai pgw) {

        String query = "INSERT INTO PEGAWAI VALUES (?,?,?,?,?) ";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            String pass = pgw.getPassword();
            String hass = BCrypt.gensalt();

            koneksi.setInt(1, pgw.getId_pegawai());
            koneksi.setString(2, pgw.getUsername());
            String passhass = BCrypt.hashpw(pgw.getPassword(), hass);
            koneksi.setString(3, passhass);
            koneksi.setString(4, pgw.getNama_pegawai());
            koneksi.setString(5, pgw.getPrivileges());

            if (passhass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "DATA TIDAK BOLEH KOSONG ");
            }

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -5) {
                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + ex);
        }
        return false;
    }

    public boolean edit_data(pegawai pgw) {

        String query = "UPDATE PEGAWAI SET USERNAME=(?), PASSWORD=(?), NAMA_PEGAWAI=(?), PRIVILEGES=(?) WHERE ID_PEGAWAI=(?)";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            String pass = pgw.getPassword();
            String hass = BCrypt.gensalt();

            koneksi.setString(1, pgw.getUsername());
            String passhass = BCrypt.hashpw(pass, hass);
            koneksi.setString(2, passhass);
            koneksi.setString(3, pgw.getNama_pegawai());
            koneksi.setString(4, pgw.getPrivileges());
            koneksi.setInt(5, pgw.getId_pegawai());

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -5) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + ex);
        }
        return false;
    }

    public boolean delete_data(pegawai pgw) {
        String query = "DELETE FROM PEGAWAI WHERE ID_PEGAWAI=(?)";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            koneksi.setInt(1, pgw.getId_pegawai());

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -1) {
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

