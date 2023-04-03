package MLBB;

final class PaintedSkin extends Skin {

    private String WarnaSkinPainted;
    private int HargaSkinPainted;

    public int getHargaSkinPainted() {
        return HargaSkinPainted;
    }

    public void setHargaSkinPainted(int hargaSkinPainted) {
        HargaSkinPainted = hargaSkinPainted;
    }

    public String getWarnaSkinPainted() {
        return WarnaSkinPainted;
    }

    public void setWarnaSkinPainted(String warnaSkinPainted) {
        WarnaSkinPainted = warnaSkinPainted;
    }

    final int hitungHarga (int hargaSkin) {
        return this.HargaSkinPainted = hargaSkin * 1300;
    }

    public PaintedSkin(String Nama, String Role, String Spesialist, int Harga, String WarnaSkinPainted, int HargaSkinPainted) {
        super(Nama, Role, Spesialist, Harga);
        this.WarnaSkinPainted = WarnaSkinPainted;
        this.HargaSkinPainted = hitungHarga(HargaSkinPainted);
    }
}
