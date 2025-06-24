package model;

public class Kategori {
    
    private String id;
    private String nama;

    public Kategori(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama;
    }    
}
