package MLBB;

public class PaintedSkin extends Skin {

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

    public PaintedSkin(String Nama, String Role, String Spesialist, int Harga, String Warna, int hargaSkin,String WarnaSkinPainted, int HargaSkinPainted) {
        super(Nama, Role, Spesialist, Harga, Warna, hargaSkin);
        this.WarnaSkinPainted = WarnaSkinPainted;
        this.HargaSkinPainted = HargaSkinPainted;
    }

}
