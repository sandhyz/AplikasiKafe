package db.helper;

import classes.menu;
import db.connection.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuHelper extends connection {

    public List<menu> select_menu() {
        List<menu> lmn = new ArrayList<>();
        String query = "call sel_menu()";
        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                menu menu = new menu();

                menu.setId_menu(rs.getInt("ID_MENU"));
                menu.setJenis_menu(rs.getString("JENIS_MENU"));
                menu.setNama_menu(rs.getString("NAMA_MENU"));
                menu.setGambar(rs.getString("GAMBAR"));
                menu.setHarga(rs.getInt("HARGA"));

                lmn.add(menu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lmn;

    }

     public List<menu> select_menu_makanan_berat() {
        List<menu> lmn = new ArrayList<>();
        String query = "SELECT * FROM MENU WHERE JENIS_MENU = 'MAKANAN BERAT' ";
        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                menu menu = new menu();

                menu.setId_menu(rs.getInt("ID_MENU"));
                menu.setJenis_menu(rs.getString("JENIS_MENU"));
                menu.setNama_menu(rs.getString("NAMA_MENU"));
                menu.setGambar(rs.getString("GAMBAR"));
                menu.setHarga(rs.getInt("HARGA"));

                lmn.add(menu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lmn;

    }
     
          public List<menu> select_menu_dessert() {
        List<menu> lmn = new ArrayList<>();
        String query = "SELECT * FROM MENU WHERE JENIS_MENU = 'DESSERT' ";
        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                menu menu = new menu();

                menu.setId_menu(rs.getInt("ID_MENU"));
                menu.setJenis_menu(rs.getString("JENIS_MENU"));
                menu.setNama_menu(rs.getString("NAMA_MENU"));
                menu.setGambar(rs.getString("GAMBAR"));
                menu.setHarga(rs.getInt("HARGA"));

                lmn.add(menu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lmn;

    }
   
             public List<menu> select_menu_minuman() {
        List<menu> lmn = new ArrayList<>();
        String query = "SELECT * FROM MENU WHERE JENIS_MENU = 'MINUMAN' ";
        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                menu menu = new menu();

                menu.setId_menu(rs.getInt("ID_MENU"));
                menu.setJenis_menu(rs.getString("JENIS_MENU"));
                menu.setNama_menu(rs.getString("NAMA_MENU"));
                menu.setGambar(rs.getString("GAMBAR"));
                menu.setHarga(rs.getInt("HARGA"));

                lmn.add(menu);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lmn;

    }
          
    public boolean insert_menu(menu menu) {
        String query = "INSERT INTO MENU VALUES (?,?,?,?,?)";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            koneksi.setInt(1, menu.getId_menu());
            koneksi.setString(2, menu.getJenis_menu());
            koneksi.setString(3, menu.getNama_menu());
            koneksi.setString(4, menu.getGambar());
            koneksi.setInt(5, menu.getHarga());

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -5) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return false;

    }

    public boolean edit_menu(menu menu) {
        String query = "UPDATE MENU SET JENIS_MENU=(?), NAMA_MENU=(?), GAMBAR=(?), HARGA=(?) WHERE ID_MENU=(?) ";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            koneksi.setString(1, menu.getJenis_menu());
            koneksi.setString(2, menu.getNama_menu());
            koneksi.setString(3, menu.getGambar());
            koneksi.setInt(4, menu.getHarga());
            koneksi.setInt(5, menu.getId_menu());

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -5) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return false;
    }
    
     public boolean delete_menu(menu menu) {
        String query = "DELETE FROM MENU WHERE ID_MENU=(?)";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            koneksi.setInt(1, menu.getId_menu());

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
