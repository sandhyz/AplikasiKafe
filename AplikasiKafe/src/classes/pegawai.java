package classes;

import db.helper.PegawaiHelper;

public class pegawai extends PegawaiHelper {

    private int id_pegawai;
    private String username;
    private String password;
    private String nama_pegawai;
    private String privileges;

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }
   
    public String getPrivileges() {
        return privileges;
    }
   
    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

}

