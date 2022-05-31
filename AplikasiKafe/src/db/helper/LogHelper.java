package db.helper;

import classes.log;
import db.connection.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LogHelper extends connection{
    
    public List<log> select_log() {
        List<log> log = new ArrayList<>();
        String query = "SELECT * FROM LOG";
        try {
            PreparedStatement koneksi = super.koneksi().prepareStatement(query);
            ResultSet rs = koneksi.executeQuery();

            while (rs.next()) {
                log Log = new log();
                Log.setId_log(rs.getInt("ID_LOG"));
                Log.setId_pegawai(rs.getString("ID_PEGAWAI"));
                Log.setAction(rs.getString("ACTION"));
                Log.setTanggal(rs.getString("TANGGAL"));
                
                log.add(Log);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }

        return log;
    }
    
}