package MLBB;

public class Skin extends Hero {
    private String warna;
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    private int hargaSkin;

    public int getHargaSkin() {
        return hargaSkin;
    }

    public void setHargaSkin(int hargaSkin) {
        this.hargaSkin = hargaSkin;
    }

    public Skin(String Nama, String Role, String Spesialist, int Harga, String warna, int hargaSkin) {
        super(Nama, Role, Spesialist, Harga);
        this.warna = warna;
        this.hargaSkin = hargaSkin;
    }
}