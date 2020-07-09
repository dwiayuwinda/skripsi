package com.example.aplikasiskripsi;

import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;

@IgnoreExtraProperties
public class BarangDB implements Serializable {
    private String kode;
    private String nama;
    private String hrgjual;
    private String stok;
    private String key;

    public BarangDB(){ }

    public BarangDB (String kode, String nama, String hrgjual, String stok){
        this.kode = kode;
        this.nama = nama;
        this.hrgjual = hrgjual;
        this.stok = stok;
    }

    public String getKey() { return key;}

    public void setKey(String key) { this.key = key; }

    public String getKode() { return kode;}

    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getHarga() { return hrgjual; }

    public void setHarga(String hrgjual) { this.hrgjual = hrgjual; }

    public String getStok() { return stok; }

    public void setStok(String stok) { this.stok = stok; }

    @Override
    public String toString() {
        return " "+kode+"\n" +
                " "+nama +"\n" +
                " "+hrgjual + "\n" +
                " "+stok;
    }
}
