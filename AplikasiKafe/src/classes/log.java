package classes;

import db.helper.LogHelper;

public class log extends LogHelper{

    /**
     * @return the id_log
     */
    public int getId_log() {
        return id_log;
    }

    /**
     * @param id_log the id_log to set
     */
    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    /**
     * @return the id_pegawai
     */
    public String getId_pegawai() {
        return id_pegawai;
    }

    /**
     * @param id_pegawai the id_pegawai to set
     */
    public void setId_pegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the tanggal
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    private int id_log ;
    private String id_pegawai;
    private String action;
    private String tanggal;
    
}
