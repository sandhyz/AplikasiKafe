package classes;

import db.helper.MenuHelper;

public class menu extends MenuHelper {

    private int id_menu;
    private String jenis_menu;
    private String nama_menu;
    private String gambar;
    private int harga;
    
    
    /**
     * @return the id_menu
     */
    public int getId_menu() {
        return id_menu;
    }

    /**
     * @param id_menu the id_menu to set
     */
    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    /**
     * @return the jenis_menu
     */
    public String getJenis_menu() {
        return jenis_menu;
    }

    /**
     * @param jenis_menu the jenis_menu to set
     */
    public void setJenis_menu(String jenis_menu) {
        this.jenis_menu = jenis_menu;
    }

    /**
     * @return the nama_menu
     */
    public String getNama_menu() {
        return nama_menu;
    }

    /**
     * @param nama_menu the nama_menu to set
     */
    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    /**
     * @return the gambar
     */
    public String getGambar() {
        return gambar;
    }

    /**
     * @param gambar the gambar to set
     */
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String toString() {
    return "menu [ID Menu=" + id_menu + ", Harga=" + harga + ", Nama Menu="+nama_menu+"]";
  }
    
    
}
