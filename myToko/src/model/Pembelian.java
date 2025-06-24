package model;

import java.util.ArrayList;

public class Pembelian {
    
    String nota;
    String idPemasok;
    int idAdmin;
    String tanggal;
    ArrayList<DetailPembelian> details;

    public Pembelian(String nota, String idPemasok, int idAdmin) {
        this.nota = nota;
        this.idPemasok = idPemasok;
        this.idAdmin = idAdmin;
        this.details = new ArrayList<>();
    }

    public Pembelian(String nota, String idPemasok, int idAdmin, String tanggal) {
        this.nota = nota;
        this.idPemasok = idPemasok;
        this.idAdmin = idAdmin;
        this.tanggal = tanggal;
    }

    public String getNota() {
        return nota;
    }

    public String getIdPemasok() {
        return idPemasok;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getTanggal() {
        return tanggal;
    }

    public ArrayList<DetailPembelian> getDetails() {
        return details;
    }
    
    public class DetailPembelian {
        
        String nota;
        String idProduk;
        int harga;
        int jumlah;

        public DetailPembelian(String nota, String idProduk, int harga, int jumlah) {
            this.nota = nota;
            this.idProduk = idProduk;
            this.harga = harga;
            this.jumlah = jumlah;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public String getNota() {
            return nota;
        }

        public String getIdProduk() {
            return idProduk;
        }

        public int getHarga() {
            return harga;
        }

        public int getJumlah() {
            return jumlah;
        }
    }
}
