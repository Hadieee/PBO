package MLBB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        system sys = new system();

        String menu = """
                <==================================================>
                <============== Management Hero MLBB ==============>
                                1. Tambah Hero
                                2. Lihat Data Hero
                                3. Ubah Data Hero
                                4. Hapus Data Hero
                                5. Keluar
                <==================================================>\n""";
        boolean gas = true;
        
        while (gas) {
            System.out.print("\033\143");
            System.out.print(menu);
            System.out.print("\n\t\tMasukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1: System.out.print("\033\143"); sys.tambah(); break;
                case 2: sys.lihat(); br.readLine(); System.out.flush(); break;
                case 3: sys.ubah(); br.readLine(); System.out.flush(); break;
                case 4: sys.hapus(); br.readLine(); System.out.flush(); break; 
                case 5: System.out.println("\nTerimakasih telah memakai program kami, Semoga harimu menyenangkan ! :) ");
                        gas = false; break; 

                default: System.out.println("Pilihan salah, Silahkan coba lagi ! ");
                         br.readLine();
                         System.out.flush();
            }
        }
    }
}