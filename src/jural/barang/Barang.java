/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jural.barang;

import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class Barang {
    private String kode, nama;
    private int harga;

    public Barang() {
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void saveBarang(){
        Database db = new Database();
        String s ="INSERT INTO `tabel_penjualan` VALUE "
                + "('"+this.kode+"','"+this.nama+"',"+this.harga+")";
        db.query(s);
    }    
    
}
