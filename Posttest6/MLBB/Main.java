package MLBB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Class main dari program
public class Main {
    // Fungsi Main
    public static void main(String[] args) throws IOException {
    
        // Input Stream Reader dan Buffered Reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Deklarasi objek dari class system
        system sys = new system();

        // List Menu utama program
        final String menu = """
                <==================================================>
                <============== Management Hero MLBB ==============>\n
                                1. Tambah Data Hero
                                2. Lihat  Data Hero
                                3. Ubah   Data Hero
                                4. Hapus  Data Hero
                                5. Cari   Data Hero
                                6. Keluar\n
                <==================================================>\n""";
        boolean gas = true;
        
        while (gas) {
            System.out.print("\033\143");
            System.out.print(menu);
            System.out.print("\n\t\tMasukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1: sys.tambah(); br.readLine(); System.out.flush(); break;
                case 2: sys.lihat() ; br.readLine(); System.out.flush(); break;
                case 3: sys.ubah()  ; br.readLine(); System.out.flush(); break;
                case 4: sys.hapus() ; br.readLine(); System.out.flush(); break; 
                case 5: sys.cari()  ; br.readLine(); System.out.flush(); break; 
                case 6: System.out.println("\nTerimakasih telah memakai program kami, Semoga harimu menyenangkan ! :) ");
                        gas = false; break; 

                default: System.out.println("Pilihan salah, Silahkan coba lagi ! ");
                         br.readLine();
                         System.out.flush();
            }
        }
    }
}
