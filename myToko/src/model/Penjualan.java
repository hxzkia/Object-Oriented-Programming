package model;

import java.util.ArrayList;

public class Penjualan {
    
    String nota;
    int idPelanggan;
    int idAdmin;
    String tanggal;
    ArrayList<DetailPenjualan> details;

    public Penjualan(String nota, int idPelanggan, int idAdmin) {
        this.nota = nota;
        this.idPelanggan = idPelanggan;
        this.idAdmin = idAdmin;
        this.details = new ArrayList<>();
    }

    public Penjualan(String nota, int idPelanggan, int idAdmin, String tanggal) {
        this.nota = nota;
        this.idPelanggan = idPelanggan;
        this.idAdmin = idAdmin;
        this.tanggal = tanggal;
    }

    public String getNota() {
        return nota;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getTanggal() {
        return tanggal;
    }

    public ArrayList<DetailPenjualan> getDetails() {
        return details;
    }
    
    public class DetailPenjualan {
        
        String nota;
        String idProduk;
        int harga;
        int jumlah;

        public DetailPenjualan(String nota, String idProduk, int harga, int jumlah) {
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
