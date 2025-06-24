package model;

public class Pelanggan {
    private int id;
    private String nama;
    private String nomorHP;

    public Pelanggan(int id, String nama, String nomorHP) {
        this.id = id;
        this.nama = nama;
        this.nomorHP = nomorHP;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama.trim();
    }

    public String getNoHP() {
        return nomorHP;
    }

    @Override
    public String toString() {
        return id + " - " + nama;
    }
}
