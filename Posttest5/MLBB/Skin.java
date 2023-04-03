package MLBB;

abstract class Skin extends Hero {
    private String warna;
    private int hargaSkin;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHargaSkin() {
        return hargaSkin;
    }

    public void setHargaSkin(int hargaSkin) {
        this.hargaSkin = hargaSkin;
    }

    abstract int hitungHarga (int hargaSkin);

    public Skin(String Nama, String Role, String Spesialist, int Harga) {
        super(Nama, Role, Spesialist, Harga);
    }
}
