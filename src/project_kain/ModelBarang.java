/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_kain;

public class ModelBarang {
    private String jenisBrg; 
    private int jmlh;
    private String alamat;
    private int harga;
    private String pembayaran; 
    private int total_bayar;
    
    
    // Constructor
    public ModelBarang(String jenisBrg, int jmlh, String alamat, int harga, String pembayaran, int total_bayar) {
        this.jenisBrg = jenisBrg;
        this.jmlh = jmlh;
        this.alamat = alamat;
        this.harga = harga;
        this.pembayaran = pembayaran;
        this.total_bayar = total_bayar;
    }
    
    // Getter dan Setter untuk jenisBrg
    public String getJenisBrg() {
        return jenisBrg;
    }

    public void setJenisBrg(String jenisBrg) {
        this.jenisBrg = jenisBrg;
    }

    // Getter dan Setter untuk pembayaran
    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    // Getter dan Setter untuk atribut lainnya
    public int getJmlh() {
        return jmlh;
    }

    public void setJmlh(int jmlh) {
        this.jmlh = jmlh;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }
}