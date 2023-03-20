package MLBB;

public class PaintedSkin extends Skin {

    private String WarnaSkinPainted;

    public String getWarnaSkinPainted() {
        return WarnaSkinPainted;
    }

    public void setWarnaSkinPainted(String warnaSkinPainted) {
        WarnaSkinPainted = warnaSkinPainted;
    }

    public PaintedSkin(String Nama, String Role, String Spesialist, int Harga, String warna, int hargaSkin,String WarnaSkinPainted) {
        super(Nama, Role, Spesialist, Harga, warna, hargaSkin);
        this.WarnaSkinPainted = WarnaSkinPainted;
    }

}
