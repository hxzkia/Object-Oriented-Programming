package model;

public class ViewDetailPenjualan {
    
    private String nota;
    private String idProduk;
    private int jumlah;
    private int harga;
    private int subtotal;

    public ViewDetailPenjualan(String nota, String idProduk, int jumlah, int harga, int subtotal) {
        this.nota = nota;
        this.idProduk = idProduk;
        this.jumlah = jumlah;
        this.harga = harga;
        this.subtotal = subtotal;
    }

    public String getNota() {
        return nota;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int getSubtotal() {
        return subtotal;
    }
}
