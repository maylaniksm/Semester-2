import java.util.Scanner;


class user{
    element geni = new api();
    element banyu = new air();
    element ltrk = new listrik();
    Scanner input = new Scanner(System.in);
    private hero pemain1;
    private hero pemain2;
    private int pilih;

    public hero getPemain1() {
        return pemain1;
    }

    public void setPemain1(hero pemain1) {
        this.pemain1 = pemain1;
    }

    public hero getPemain2() {
        return pemain2;
    }

    public void setPemain2(hero pemain2) {
        this.pemain2 = pemain2;
    }

    public int getPilih() {
        return pilih;
    }

    public void setPilih(int pilih) {
        this.pilih = pilih;
    }





    public void tarung(hero pemain1, hero pemain2){
        System.out.println("=============PEMAIN 1===============");
        pemain1.infostatus();
        System.out.println("----------------------------");
        System.out.println("==============PEMAIN 2==============");
        pemain2.infostatus();
        System.out.println("----------------------------");
        System.out.println("++++++++++++FIGHT++++++++++++");
        int counter = 1;
        while (true){
            System.out.println("ROUND "+counter);
            counter++;
            System.out.println("GILIRAN PEMAIN 1");
            pemain1.spawnintro();
            pemain1.attack(pemain2);
            pemain2.battlestatus("PEMAIN 2 - ");
            System.out.println("*********************");
            if (pemain1.isIsdefeated()== true){
                System.out.println("Pemain 1 Mati");
                System.out.println("Player 2 Menang");
                break;
            } else if (pemain2.isIsdefeated() == true) {
                System.out.println("Pemain 2 Mati");
                System.out.println("Pemain 1 Menang");
            }
            System.out.println("GILIRAN PEMAIN 2");
            pemain2.spawnintro();
            pemain2.attack(pemain1);
            pemain1.battlestatus("PEMAIN 1 - ");
            System.out.println("**********************");
            if (pemain1.isIsdefeated()== true){
                System.out.println("Pemain 1 Mati");
                System.out.println("Player 2 Menang");
                break;
            } else if (pemain2.isIsdefeated() == true) {
                System.out.println("Pemain 2 Mati");
                System.out.println("Pemain 1 Menang");
                break;
            }
        }

    }

    public void tampil(){
        System.out.println("++++++++ PEMAIN 1 +++++++");
        System.out.println("+++ SELECT YOUR ROLE ++++");
        System.out.println("1. Asssasin");
        System.out.println("2. Mage");
        System.out.println("3. Tank");
        System.out.println("Pilih : ");
        setPilih(input.nextInt());
        switch (getPilih()){
            case 1:
                System.out.println("level :");
                assasin p1_a= new assasin(input.nextInt());
                System.out.println("Apakah Ingin menggunakan senjata?");
                System.out.println("1. AWP");
                System.out.println("2. Light Saber");
                System.out.println("Masukkan pilihan ");
                int pilihan = input.nextInt();
                switch (pilihan){
                    case 1:
                        System.out.println("Pilih Element ");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Lisrik");
                        System.out.println("Pilih : ");
                        int pilihan1 = input.nextInt();
                        switch (pilihan1){
                            case 1:
                                weapon gun1 = new gun("AWP",geni,500);
                                p1_a.useweap(gun1);
                                break;
                            case 2:
                                weapon gun2 = new gun("AWP", banyu, 500);
                                p1_a.useweap(gun2);
                                break;
                            case 3:
                                weapon gun3 = new gun("AWP", ltrk, 500);
                                p1_a.useweap(gun3);
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Pilih Element ");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Lisrik");
                        System.out.println("Pilih : ");
                        int pilihan2 = input.nextInt();
                        switch (pilihan2) {
                            case 1:
                                weapon s1 = new Sword("Light Saber", 500, geni);
                                p1_a.useweap(s1);
                                break;
                            case 2:
                                weapon s2 = new Sword("Light Saber", 500, banyu);
                                p1_a.useweap(s2);
                                break;
                            case 3:
                                weapon s3 = new Sword("Light Saber", 500, ltrk);
                                p1_a.useweap(s3);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                setPemain1(p1_a);
                 break;
            case 2:
                System.out.println("Level : ");
                mage p1_m = new mage(input.nextInt());
                setPemain1(p1_m);
                break;

            case 3:
                System.out.println("Level : ");
                tank p1_t = new tank(input.nextInt());
                System.out.println("Tambahan Armor?");
                System.out.println("1. Ya");
                System.out.println("0. No");
                int pilihan3 = input.nextInt();
                if (pilihan3==1){
                    System.out.println("1. Fire");
                    System.out.println("2. Water");
                    System.out.println("3. Earth");
                    System.out.println("4. Wind");
                    System.out.print("Pilih element: ");
                    int pilihan4 = input.nextInt();
                    switch (pilihan4){

                        case 1:
                            armor armor1 = new armor(4000, geni);
                            p1_t.usearmor(armor1);
                            break;
                        case 2:
                            armor armor2 = new armor(4000, banyu);
                            p1_t.usearmor(armor2);
                            break;
                        case 3:
                            armor armor3 = new armor(4000, ltrk);
                            p1_t.usearmor(armor3);
                            break;
                        default:
                            break;
                    }

                }else {
                    System.out.println("Tank tanpa Shield");
                }

                setPemain1(p1_t);
                break;
        }

        System.out.println("++++++++ PEMAIN 2 +++++++");
        System.out.println("+++ SELECT YOUR ROLE ++++");
        System.out.println("1. Asssasin");
        System.out.println("2. Mage");
        System.out.println("3. Tank");
        System.out.println("Pilih : ");
        setPilih(input.nextInt());
        switch (getPilih()){
            case 1:
                System.out.println("level :");
                assasin p2_a= new assasin(input.nextInt());
                System.out.println("Apakah Ingin menggunakan senjata?");
                System.out.println("1. AWP");
                System.out.println("2. Light Saber");
                System.out.println("Masukkan pilihan ");
                int pilihan5 = input.nextInt();
                switch (pilihan5){
                    case 1:
                        System.out.println("Pilih Element ");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Lisrik");
                        System.out.println("Pilih : ");
                        int pilihan6 = input.nextInt();
                        switch (pilihan6){
                            case 1:
                                weapon gun1 = new gun("AWP",geni,500);
                                p2_a.useweap(gun1);
                                break;
                            case 2:
                                weapon gun2 = new gun("AWP", banyu, 500);
                                p2_a.useweap(gun2);
                                break;
                            case 3:
                                weapon gun3 = new gun("AWP", ltrk, 500);
                                p2_a.useweap(gun3);
                                break;
                            default:
                                break;
                        }
                    case 2:
                        System.out.println("Pilih Element ");
                        System.out.println("1.Pyro");
                        System.out.println("2.Hydro");
                        System.out.println("3.Lisrik");
                        System.out.println("Pilih : ");
                        int pilihan7 = input.nextInt();
                        switch (pilihan7) {
                            case 1:
                                weapon s1 = new Sword("Light Saber", 500, geni);
                                p2_a.useweap(s1);
                                break;
                            case 2:
                                weapon s2 = new Sword("Light Saber", 500, banyu);
                                p2_a.useweap(s2);
                                break;
                            case 3:
                                weapon s3 = new Sword("Light Saber", 500, ltrk);
                                p2_a.useweap(s3);
                                break;
                            default:
                                break;
                        }
                    default:
                        break;
                }

                setPemain2(p2_a);
                break;
            case 2:
                System.out.println("Level : ");
                mage p2_m = new mage(input.nextInt());
                setPemain2(p2_m);
                break;

            case 3:
                System.out.println("Level : ");
                tank p2_t = new tank(input.nextInt());
                System.out.println("Tambahan Armor?");
                System.out.println("1. Ya");
                System.out.println("0. No");
                int pilihan8 = input.nextInt();
                if (pilihan8==1){
                    System.out.println("1. Fire");
                    System.out.println("2. Water");
                    System.out.println("3. Earth");
                    System.out.println("4. Wind");
                    System.out.print("Pilih element: ");
                    int pilihan9 = input.nextInt();
                    switch (pilihan9){

                        case 1:
                            armor armor1 = new armor(4000, geni);
                            p2_t.usearmor(armor1);
                            break;
                        case 2:
                            armor armor2 = new armor(4000, banyu);
                            p2_t.usearmor(armor2);
                            break;
                        case 3:
                            armor armor3 = new armor(4000, ltrk);
                            p2_t.usearmor(armor3);
                            break;
                        default:
                            break;
                    }

                }else {
                    System.out.println("Tank tanpa Shield");
                }
                setPemain2(p2_t);
                break;

        }
        tarung(getPemain1() , getPemain2());

    }

}







public class Main {
    public static void main(String[] args) {
        user obj = new user();
        obj.tampil();
    }
}