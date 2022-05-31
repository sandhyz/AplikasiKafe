package classes;

import hashing.BCrypt;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class auth {

    
     public pegawai pegawai(String username, String password) throws NoSuchAlgorithmException, SQLException {
        pegawai pgw = new pegawai();
        pgw.setUsername(username);
        pgw.setPassword(password);

        pegawai rspegawai = pgw.select_data_with_username(pgw);

        
        if (rspegawai.getId_pegawai() == 0) {
            return new pegawai();
        }

        boolean matchedAdm = BCrypt.checkpw(pgw.getPassword(), rspegawai.getPassword());

        if (matchedAdm) {
            session.setUserlogin(rspegawai.getId_pegawai());
            return rspegawai;
        }

        return new pegawai();
    }
    
    
}
