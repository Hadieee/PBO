package MLBB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hero {

    String Nama;
    String Role = """ 
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

    String Spesialist = """ 
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
    int Harga;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);


    public void tambah() throws IOException {

        System.out.println("""
                            \n<============================================>
                            <============== Input Data Hero =============>\n""");

        System.out.print("\nMasukan Nama Hero : ");
        Nama = br.readLine();
        
        System.out.print(Role);
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
        
        System.out.print(Spesialist);
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
        Harga = Integer.parseInt(br.readLine());
    }
}