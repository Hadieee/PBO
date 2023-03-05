package MLBB;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class system {

    ArrayList<Hero> list = new ArrayList<Hero>();
    Hero hero = new Hero();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public void tambah() throws IOException {

        hero.tambah();
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
                System.out.println("\t" + "Role Hero       : " +  (list.get(i)).FixRole);
                System.out.println("\t" + "Spesialist Hero : " + (list.get(i)).FixSpesialist);
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
        hero.tambah();

        list.set(indeks - 1, hero);
        System.out.println("\nData Hero Berhasil Diubah ! ");
    }

    public void hapus() throws IOException {

        int indeks;
        lihat();

        System.out.print("Masukan Indeks Data Hero Yang Ingin Dihapus : ");
        indeks = Integer.parseInt(br.readLine());

        list.remove(indeks - 1);
        System.out.println("Data Hero Berhasil Dihapus ! ");
    }
}