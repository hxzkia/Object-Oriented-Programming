package model;

public class Pemasok {
    
    private String id;
    private String nama;
    private String nomorHP;

    public Pemasok(String id, String nama, String nomorHP) {
        this.id = id;
        this.nama = nama;
        this.nomorHP = nomorHP;
    }

    public String getId() {
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
