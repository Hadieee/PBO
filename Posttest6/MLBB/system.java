package MLBB;

import java.util.*;
import java.io.*;

// Class sistem dari program
public class system implements Emblem{
    // Deklarasi Array
    ArrayList<Hero> list = new ArrayList<Hero>();
    ArrayList<PaintedSkin> listPaintedSkin = new ArrayList<PaintedSkin>();

    String NamaHero;

    // List dari Role Hero MLBB
    final static String ListRole = """ 
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
    final static String ListSpesialist = """ 
                \n<================ Spesialist Hero ===============>
                    1. Burst             8. Initiator
                    2. Charge            9. Magic Damage
                    3. Chase            10. Mixed Damage
                    4. Control          11. Push
                    5. Crowd Control    12. Poke
                    6. Damage           13. Regen
                    7. Guard            14. Support
                <===================================================> \n""";

    int PickSpesialist;
    String FixSpesialist;
    int HargaHero;

    // List dari Role Hero MLBB
    final static String ListEmblem = """ 
                    \n<============ Emblem Hero ============>
                                    1. Physical
                                    2. Magical
                                    3. Tank
                                    4. Jungle
                                    5. Assasin
                                    6. Mage
                                    7. Fighter
                                    8. Marksman
                                    9. Support
                    <=========================================> \n""";
    int PickEmblem;
    String FixEmblem;
    int HargaEmblem;

    // Input Stream Reader dan Buffered Reader
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // Fungsi tambah data
    final void tambah() throws IOException {
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

            default: System.out.println("Pilihan Salah !");
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

            default: System.out.println("Pilihan Salah !");
        }
        
        System.out.print("Masukan Harga Hero : ");
        HargaHero = Integer.parseInt(br.readLine());

        FixEmblem = pilihEmblem();
        HargaEmblem = hitungEmblem();

        Hero hero = new Hero(NamaHero, FixRole, FixSpesialist, HargaHero, FixEmblem, HargaEmblem);
        list.add(hero);

        tambahSkin(list.size() - 1);
    }

    public final String pilihEmblem() throws IOException {
        System.out.print(ListEmblem);
        System.out.print("Masukan Indeks Dari Emblem Hero : ");
        PickEmblem = Integer.parseInt(br.readLine());
        switch(PickEmblem) {
            case 1: FixEmblem = "Phisycal"; break;
            case 2: FixEmblem = "Magical"; break;
            case 3: FixEmblem = "Tank"; break;
            case 4: FixEmblem = "Jungle"; break;
            case 5: FixEmblem = "Assasin"; break;
            case 6: FixEmblem = "Mage"; break;
            case 7: FixEmblem = "Fighter"; break;
            case 8: FixEmblem = "Marksman"; break;
            case 9: FixEmblem = "Support"; break;

            default: System.out.println("Pilihan Salah !");
        }

        return FixEmblem;
    }

    public final int hitungEmblem() throws IOException {
        System.out.print("Masukan Harga Dari Emblem Hero : ");
        HargaEmblem = Integer.parseInt(br.readLine());

        return HargaEmblem += 1300;
    }

    public void tambahSkin(int indeks) throws IOException {        
        System.out.print("\nMasukan Warna Skin Painted Hero : ");
        String WarnaSkinPainted = br.readLine();

        System.out.print("Masukan Harga Skin Painted Hero : ");
        int HargaSkinPainted = Integer.parseInt(br.readLine());
    
        PaintedSkin skinPainted = new PaintedSkin((list.get(indeks)).getNama(), (list.get(indeks)).getRole(), 
                            (list.get(indeks)).getSpesialist(), (list.get(indeks)).getHarga(), (list.get(indeks)).getEmblem(),
                            (list.get(indeks)).getHargaEmblem(), WarnaSkinPainted, HargaSkinPainted);
        
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
                System.out.println("\t" + "Warna Skin Painted Hero : " + ( listPaintedSkin.get(i)).getWarnaSkinPainted());
                System.out.println("\t" + "Harga Skin Painted Hero : " + ( listPaintedSkin.get(i)).getHargaSkinPainted());
                System.out.println("\n");
            }
        }
    }

    // Fungsi ubah data
    public void ubah() throws IOException {
        System.out.print("\033\143");
        int indeks;

        lihat();
        System.out.print("Masukan Indeks Data Hero Yang Ingin Diubah : ");
        indeks = Integer.parseInt(br.readLine());

        int hasil = search(indeks - 1);

        if(hasil == -1) {
            System.out.println("Data Hero Tersebut Tidak Ada !");
            br.readLine();
        }
        else{

            System.out.println("""
                                <============================================>
                                <========== Masukan Data Hero Baru ==========>\n""");
        
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

                default: System.out.println("Pilihan Salah !");
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

                default: System.out.println("Pilihan Salah !");
            }
            
            System.out.print("Masukan Harga Hero : ");
            HargaHero = Integer.parseInt(br.readLine());

            FixEmblem = pilihEmblem();
            HargaEmblem = hitungEmblem();
    
            Hero hero = new Hero(NamaHero, FixRole, FixSpesialist, HargaHero, FixEmblem, HargaEmblem);

            list.set(indeks - 1, hero);
            
            System.out.println("""
                \n<============================================>
                <========== Masukan data skin hero ==========>\n\n""");
            
            
            System.out.print("\nMasukan Warna Skin Painted Hero : ");
            String WarnaSkinPainted = br.readLine();

            System.out.print("Masukan Harga Skin Painted Hero : ");
            int HargaSkinPainted = Integer.parseInt(br.readLine());
        
            PaintedSkin skinPainted = new PaintedSkin((list.get(indeks - 1)).getNama(), (list.get(indeks - 1)).getRole(), 
                                (list.get(indeks - 1)).getSpesialist(), (list.get(indeks - 1)).getHarga(), (list.get(indeks - 1)).getEmblem(),
                                (list.get(indeks - 1)).getHargaEmblem(), WarnaSkinPainted, HargaSkinPainted);
            

            listPaintedSkin.set(indeks - 1, skinPainted);
            System.out.println("\nData Hero Berhasil Diubah ! ");
        }
    }

    // Fungsi hapus data
    public void hapus() throws IOException {
        System.out.print("\033\143");
        int indeks;
        lihat();

        System.out.print("Masukan Indeks Data Hero Yang Ingin Dihapus : ");
        indeks = Integer.parseInt(br.readLine());

        int hasil = search(indeks - 1);

        if(hasil == -1) {
            System.out.println("Data Hero Tersebut Tidak Ada !");
            br.readLine();
        }
        else{
            list.remove(indeks - 1);
            listPaintedSkin.remove(indeks - 1);
            System.out.println("\nData Hero Berhasil Dihapus ! ");
        }
    }
    
    public void cari () throws IOException {
        System.out.print("\033\143");
        System.out.println("""
            \n<===================================>
            <========== Cari Data Hero ==========>\n\n""");

        System.out.print("Masukkan Nama Hero Yang Ingin Dicari : ");
        String Cari = br.readLine();

        int hasil = search(list, Cari);

        if(hasil == -1) {
            System.out.println("Data Hero Tersebut Tidak Ada !");
        }

        else{
            System.out.println("""
                <=============================================================>
                <=================== Data Hero Ditemukan ! ===================>\n\n""");

                System.out.println("\t\t       <" + (hasil + 1) + ">");
                System.out.println("\t" + "Nama Hero               : " + ( list.get(hasil)).getNama());
                System.out.println("\t" + "Role Hero               : " + ( list.get(hasil)).getRole());
                System.out.println("\t" + "Spesialist Hero         : " + ( list.get(hasil)).getSpesialist());
                System.out.println("\t" + "Harga Hero              : " + ( list.get(hasil)).getHarga());
                System.out.println("\t" + "Warna Skin Painted Hero : " + ( listPaintedSkin.get(hasil)).getWarnaSkinPainted());
                System.out.println("\t" + "Harga Skin Painted Hero : " + ( listPaintedSkin.get(hasil)).getHargaSkinPainted());
        }
    }

    public int search(int indeks) {
        for(int i = 0; i < list.size(); i++) {
            if(i == indeks) {
                return i;
            }
        }
        return -1;
    } 

    public int search(ArrayList<Hero> list, String name) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
           if (list.get(i).getNama().equals(name)) {
              return i;
           }
        }
        return -1;
     }
}
