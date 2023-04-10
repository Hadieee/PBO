package MLBB;

public class Hero {
    
    private String Nama, Role, Spesialist, Emblem;
    private int Harga, HargaEmblem;
    
    public String getNama() {
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getRole() {
        return Role;
    }
    
    public void setRole(String Role) {
        this.Role = Role;
    }
    
    public String getSpesialist() {
        return Spesialist;
    }

    public void setSpesialist(String Spesialist) {
        this.Spesialist = Spesialist;
    }
    
    public int getHarga() {
        return Harga;
    }
    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getEmblem() {
        return Emblem;
    }

    public void setEmblem(String emblem) {
        Emblem = emblem;
    }

    public int getHargaEmblem() {
        return HargaEmblem;
    }

    public void setHargaEmblem(int hargaEmblem) {
        HargaEmblem = hargaEmblem;
    }
    
    int hitungHarga(int harga) {
        return this.Harga = harga * 1000;
    }
    
    public Hero(String Nama, String Role, String Spesialist, int Harga, String Emblem, int HargaEmblem) {
        this.Nama = Nama;
        this.Role = Role;
        this.Spesialist = Spesialist;
        this.Harga = hitungHarga(Harga);
        this.Emblem = Emblem;
        this.HargaEmblem = HargaEmblem;
    }
}
