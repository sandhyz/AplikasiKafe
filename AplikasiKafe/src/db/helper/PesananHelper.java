package db.helper;

import classes.menu;
import classes.pesanan;
import classes.session;
import com.google.gson.Gson;
import db.connection.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PesananHelper extends connection {

    public boolean insert_data(pesanan psn) {

        String query = "INSERT INTO PESANAN VALUES (?,?,?,?,NOW(),?,?) ";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);

            String nama_pemesan = psn.getNama_pemesan();
            int nomor_meja = psn.getNo_meja();
            String det_pesanan = psn.getDet_pesanan();

            koneksi.setInt(1, psn.getId_pesanan());
            koneksi.setInt(2, psn.getId_pegawai());
            koneksi.setString(3, psn.getNama_pemesan());
            koneksi.setInt(4, psn.getNo_meja());
            koneksi.setInt(5, Integer.parseInt(psn.getTotal_harga()));
            koneksi.setString(6, psn.getDet_pesanan());

            int count_inserted = koneksi.executeUpdate();

            if (count_inserted != -7) {
                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + ex);
        }
        return false;
    }

    public List<pesanan> select_pesanan() throws SQLException {
        List<pesanan> lpsn = new ArrayList<>();
        String query = "SELECT * FROM PESANAN";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();
            pesanan psn = new pesanan();

            while (rs.next()) {
                

                psn.setId_pesanan(rs.getInt("ID_PESANAN"));
                psn.setId_pegawai(rs.getInt("ID_PEGAWAI"));
                psn.setNama_pemesan(rs.getString("NAMA_PEMESAN"));
                psn.setNo_meja(rs.getInt("NOMOR_MEJA"));
                psn.setTanggal(rs.getString("TANGGAL"));
                psn.setDet_pesanan(rs.getString("DET_PESANAN"));
                
                
                lpsn.add(psn);
            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lpsn;
    }

      public List<pesanan> select_total_harian() {
        List<pesanan> lpsn = new ArrayList<>();
        String query = "call pen_today()";

        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                pesanan psn = new pesanan();
                psn.setTotal_harian(rs.getInt("total_harian"));

                lpsn.add(psn);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return lpsn;
    }
    

}
