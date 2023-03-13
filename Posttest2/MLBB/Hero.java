package MLBB;

public class Hero {

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * @return the Spesialist
     */
    public String getSpesialist() {
        return Spesialist;
    }

    /**
     * @param Spesialist the Spesialist to set
     */
    public void setSpesialist(String Spesialist) {
        this.Spesialist = Spesialist;
    }

    /**
     * @return the Harga
     */
    public int getHarga() {
        return Harga;
    }

    /**
     * @param Harga the Harga to set
     */
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    private String Nama;
    private String Role;
    private String Spesialist;
    private int Harga;

    public Hero(String Nama, String Role, String Spesialist, int Harga) {
        this.Nama = Nama;
        this.Role = Role;
        this.Spesialist = Spesialist;
        this.Harga = Harga;
    }
}
