package classes;

import db.helper.PesananHelper;

public class pesanan extends PesananHelper {

    private int id_pesanan;
    private int id_pegawai;
    private String nama_pemesan;
    private int no_meja;
    private String tanggal;
    private String det_pesanan;
    private String total_harga;
    private int total_harian;

    /**
     * @return the total_harian
     */
    public int getTotal_harian() {
        return total_harian;
    }

    /**
     * @param total_harian the total_harian to set
     */
    public void setTotal_harian(int total_harian) {
        this.total_harian = total_harian;
    }

    /**
     * @return the total_harga
     */
    public String getTotal_harga() {
        return total_harga;
    }

    /**
     * @param total_harga the total_harga to set
     */
    public void setTotal_harga(String total_harga) {
        this.total_harga = total_harga;
    }

    /**
     * @return the id_pesanan
     */
    public int getId_pesanan() {
        return id_pesanan;
    }

    /**
     * @param id_pesanan the id_pesanan to set
     */
    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    /**
     * @return the id_pegawai
     */
    public int getId_pegawai() {
        return id_pegawai;
    }

    /**
     * @param id_pegawai the id_pegawai to set
     */
    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    /**
     * @return the nama_pemesan
     */
    public String getNama_pemesan() {
        return nama_pemesan;
    }

    /**
     * @param nama_pemesan the nama_pemesan to set
     */
    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }

    /**
     * @return the no_meja
     */
    public int getNo_meja() {
        return no_meja;
    }

    /**
     * @param no_meja the no_meja to set
     */
    public void setNo_meja(int no_meja) {
        this.no_meja = no_meja;
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

    /**
     * @return the det_pesanan
     */
    public String getDet_pesanan() {
        return det_pesanan;
    }

    /**
     * @param det_pesanan the det_pesanan to set
     */
    public void setDet_pesanan(String det_pesanan) {
        this.det_pesanan = det_pesanan;
    }
    
}
