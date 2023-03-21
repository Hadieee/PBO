package MLBB;

import java.util.*;
import java.io.*;

// Class sistem dari program
public class system {
    // Deklarasi Array
    ArrayList<Hero> list = new ArrayList<Hero>();
    ArrayList<Skin> listSkin = new ArrayList<Skin>();
    ArrayList<PaintedSkin> listPaintedSkin = new ArrayList<PaintedSkin>();

    String NamaHero;

    // List dari Role Hero MLBB
    String ListRole = """ 
                    \n<============ Role Hero ============>
                                1. Tank
                                2. Fighter
                                3. Assasin
                                4. Mage
                                5. Marksman
                                6. Support
                    <===================================> \n""";
    int PickRole;
    String FixRole;

    // List dari Spesialist Hero MLBB
    String ListSpesialist = """ 
                \n<================ Role Hero ===============>
                    1. Burst             8. Initiator
                    2. Charge            9. Magic Damage
                    3. Chase            10. Mixed Damage
                    4. Control          11. Push
                    5. Crowd Control    12. Poke
                    6. Damage           13. Regen
                    7. Guard            14. Support
                <==========================================> \n""";

    String menuSkin = """
                \n<============== Menu Skin Hero ==============>\n
                            1. Tambah Skin Hero
                            2. Tambah Skin Painted Hero
                            3. Kembali Ke Menu Utama\n
                <============================================> \n""";


    int PickSpesialist;
    String FixSpesialist;
    int HargaHero;

    // Input Stream Reader dan Buffered Reader
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // Fungsi tambah data
    public void tambah() throws IOException {
        System.out.print("\033\143");
        System.out.println("""
                            \n<============================================>
                            <============== Input Data Hero =============>\n""");

        System.out.print("\nMasukan Nama Hero : ");
        NamaHero = br.readLine();
        
        System.out.print(ListRole);
        System.out.print("Masukan Indeks Dari Role Hero : ");
        PickRole = Integer.parseInt(br.readLine());
        switch(PickRole) {
            case 1: FixRole = "Tank"; break;
            case 2: FixRole = "Fighter"; break;
            case 3: FixRole = "Assasin"; break;
            case 4: FixRole = "Mage"; break;
            case 5: FixRole = "Marksman"; break;
            case 6: FixRole = "Support"; break;

            default: System.out.println("Pilihan salah !");
        }
        
        System.out.print(ListSpesialist);
        System.out.print("Masukan Indeks Dari Spesialist Hero : ");
        PickSpesialist = Integer.parseInt(br.readLine());
        switch(PickSpesialist) {
            case 1: FixSpesialist = "Burst"; break;
            case 2: FixSpesialist = "Charge"; break;
            case 3: FixSpesialist = "Chase"; break;
            case 4: FixSpesialist = "Control"; break;
            case 5: FixSpesialist = "Crowd Control"; break;
            case 6: FixSpesialist = "Damage"; break;
            case 7: FixSpesialist = "Guard"; break;
            case 8: FixSpesialist = "Initiator"; break;
            case 9: FixSpesialist = "Magic Damage"; break;
            case 10: FixSpesialist = "Mixed Damage"; break;
            case 11: FixSpesialist = "Push"; break;
            case 12: FixSpesialist = "Poke"; break;
            case 13: FixSpesialist = "Regen"; break;
            case 14: FixSpesialist = "Support"; break;

            default: System.out.println("Pilihan salah !");
        }
        
        System.out.print("Masukan Harga Hero : ");
        HargaHero = Integer.parseInt(br.readLine());

        Hero hero = new Hero(NamaHero, FixRole, FixSpesialist, HargaHero);
        list.add(hero);

        tambahSkin(list.size() - 1);
        tambahSkinPainted(list.size() - 1);
    }


    public void tambahSkin(int indeks) throws IOException {
        System.out.println("""
            \n<=============================================>
            <========== Masukkan Data Skin Hero ==========>\n""");
        
        System.out.print("\nMasukan Warna Skin Hero : ");
        String WarnaSkin = br.readLine();

        System.out.print("Masukan Harga Skin Hero : ");
        int HargaSkin = Integer.parseInt(br.readLine());
    
        Skin skin = new Skin((list.get(indeks)).getNama(), (list.get(indeks)).getRole(), 
                            (list.get(indeks)).getSpesialist(), (list.get(indeks)).getHarga(), 
                            WarnaSkin, HargaSkin);
        
        listSkin.add(skin);
    }

    public void tambahSkinPainted(int indeks) throws IOException {        
        System.out.print("\nMasukan Warna Skin Painted Hero : ");
        String WarnaSkinPainted = br.readLine();

        System.out.print("Masukan Harga Skin Painted Hero : ");
        int HargaSkinPainted = Integer.parseInt(br.readLine());
    
        PaintedSkin skinPainted = new PaintedSkin((list.get(indeks)).getNama(), (list.get(indeks)).getRole(), 
                            (list.get(indeks)).getSpesialist(), (list.get(indeks)).getHarga(),
                            (listSkin.get(indeks)).getWarna(), (listSkin.get(indeks)).getHargaSkin(), WarnaSkinPainted, HargaSkinPainted);
        
        listPaintedSkin.add(skinPainted);

        System.out.println("\nSkin Hero " + listPaintedSkin.get(indeks).getNama() + " Berhasil Ditambah ! ");
    }

    // Fungsi lihat data
    public void lihat() throws IOException {

        System.out.print("\033\143");
        if(list.size() == 0) {
            System.out.println("Tidak ada Hero disini ! ");
        }
        else {
            System.out.println("""
                            <=================================================>
                            <=================== List Hero ===================>\n\n""");
    
            for (int i = 0; i < list.size(); i++) {
                System.out.println("\t\t       <" + (i + 1) + ">");
                System.out.println("\t" + "Nama Hero               : " + ( list.get(i)).getNama());
                System.out.println("\t" + "Role Hero               : " + ( list.get(i)).getRole());
                System.out.println("\t" + "Spesialist Hero         : " + ( list.get(i)).getSpesialist());
                System.out.println("\t" + "Harga Hero              : " + ( list.get(i)).getHarga());
                System.out.println("\t" + "Warna Skin Hero         : " + ( listSkin.get(i)).getWarna());
                System.out.println("\t" + "Harga Skin Hero         : " + ( listSkin.get(i)).getHargaSkin());
                System.out.println("\t" + "Warna Skin Painted Hero : " + ( listPaintedSkin.get(i)).getWarnaSkinPainted());
                System.out.println("\t" + "Harga Skin Painted Hero : " + ( listPaintedSkin.get(i)).getHargaSkinPainted());
                System.out.println("\n");
            }
        }
    }

    // Fungsi ubah data
    public void ubah() throws IOException {

        int indeks;

        lihat();
        System.out.print("Masukan Indeks Data Hero Yang Ingin Diubah : ");
        indeks = Integer.parseInt(br.readLine());

        System.out.println("""
                            <============================================>
                            <========== Masukan data hero baru ==========>\n""");
    
        System.out.print("\nMasukan Nama Hero : ");
        NamaHero = br.readLine();
        
        System.out.print(ListRole);
        System.out.print("Masukan Indeks Dari Role Hero : ");
        PickRole = Integer.parseInt(br.readLine());
        switch(PickRole) {
            case 1: FixRole = "Tank"; break;
            case 2: FixRole = "Fighter"; break;
            case 3: FixRole = "Assasin"; break;
            case 4: FixRole = "Mage"; break;
            case 5: FixRole = "Marksman"; break;
            case 6: FixRole = "Support"; break;

            default: System.out.println("Pilihan salah !");
        }
        
        System.out.print(ListSpesialist);
        System.out.print("Masukan Indeks Dari Spesialist Hero : ");
        PickSpesialist = Integer.parseInt(br.readLine());
        switch(PickSpesialist) {
            case 1: FixSpesialist = "Burst"; break;
            case 2: FixSpesialist = "Charge"; break;
            case 3: FixSpesialist = "Chase"; break;
            case 4: FixSpesialist = "Control"; break;
            case 5: FixSpesialist = "Crowd Control"; break;
            case 6: FixSpesialist = "Damage"; break;
            case 7: FixSpesialist = "Guard"; break;
            case 8: FixSpesialist = "Initiator"; break;
            case 9: FixSpesialist = "Magic Damage"; break;
            case 10: FixSpesialist = "Mixed Damage"; break;
            case 11: FixSpesialist = "Push"; break;
            case 12: FixSpesialist = "Poke"; break;
            case 13: FixSpesialist = "Regen"; break;
            case 14: FixSpesialist = "Support"; break;

            default: System.out.println("Pilihan salah !");
        }
        
        System.out.print("Masukan Harga Hero : ");
        HargaHero = Integer.parseInt(br.readLine());

        Hero hero = new Hero(NamaHero, FixRole, FixSpesialist, HargaHero);

        list.set(indeks - 1, hero);
        
        System.out.println("""
            \n<============================================>
            <========== Masukan data skin hero ==========>\n\n""");
        
        System.out.print("\nMasukan Warna Skin Hero : ");
        String WarnaSkin = br.readLine();

        System.out.print("Masukan Harga Skin Hero : ");
        int HargaSkin = Integer.parseInt(br.readLine());
    
        Skin skin = new Skin((list.get(indeks - 1)).getNama(), (list.get(indeks - 1)).getRole(), 
                            (list.get(indeks - 1)).getSpesialist(), (list.get(indeks - 1)).getHarga(), 
                            WarnaSkin, HargaSkin);
                            
        listSkin.set(indeks - 1, skin);
        
        System.out.print("\nMasukan Warna Skin Painted Hero : ");
        String WarnaSkinPainted = br.readLine();

        System.out.print("Masukan Harga Skin Painted Hero : ");
        int HargaSkinPainted = Integer.parseInt(br.readLine());
    
        PaintedSkin skinPainted = new PaintedSkin((list.get(indeks - 1)).getNama(), (list.get(indeks - 1)).getRole(), 
                            (list.get(indeks - 1)).getSpesialist(), (list.get(indeks - 1)).getHarga(),
                            (listSkin.get(indeks - 1)).getWarna(), (listSkin.get(indeks - 1)).getHargaSkin(), WarnaSkinPainted, HargaSkinPainted);
        

        listPaintedSkin.set(indeks - 1, skinPainted);
        System.out.println("\nData Hero Berhasil Diubah ! ");
    }

    // Fungsi hapus data
    public void hapus() throws IOException {

        int indeks;
        lihat();

        System.out.print("Masukan Indeks Data Hero Yang Ingin Dihapus : ");
        indeks = Integer.parseInt(br.readLine());

        list.remove(indeks - 1);
        listSkin.remove(indeks - 1);
        listPaintedSkin.remove(indeks - 1);
        System.out.println("\nData Hero Berhasil Dihapus ! ");
    }
}
