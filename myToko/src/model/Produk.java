package model;

public class Produk {
    
    private String id;
    private String nama;
    private String kategori;
    private int stok;
    private int harga;

    public Produk(String id, String nama, String kategori, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama.trim();
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama;
    }
}
