package MLBB;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class system {

    ArrayList<Hero> list = new ArrayList<Hero>();

    String NamaHero;
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
    int PickSpesialist;
    String FixSpesialist;
    int HargaHero;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public void tambah() throws IOException {

        
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
        
        System.out.println("\nHero " + list.get(list.size() - 1).Nama + " Berhasil Ditambah ! ");
        br.readLine();
    }

    public void lihat() throws IOException {

        System.out.print("\033\143");
        if(list.size() == 0) {
            System.out.println("Tidak ada Hero disini ! ");
        }
        else {
            System.out.println("""
                            <===========================================>
                            <================ List Hero ================>""");
    
            for (int i = 0; i < list.size(); i++) {
                System.out.println("\t\t     <" + (i + 1) + ">");
                System.out.println("\t" + "Nama Hero       : " + ( list.get(i)).Nama);
                System.out.println("\t" + "Role Hero       : " +  (list.get(i)).Role);
                System.out.println("\t" + "Spesialist Hero : " + (list.get(i)).Spesialist);
                System.out.println("\t" + "Harga Hero      : " +  (list.get(i)).Harga);
                System.out.println("\n");
            }
        }
    }

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
        System.out.println("\nData Hero Berhasil Diubah ! ");
    }

    public void hapus() throws IOException {

        int indeks;
        lihat();

        System.out.print("Masukan Indeks Data Hero Yang Ingin Dihapus : ");
        indeks = Integer.parseInt(br.readLine());

        list.remove(indeks - 1);
        System.out.println("\nData Hero Berhasil Dihapus ! ");
    }
}