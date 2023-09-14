import java.util.Scanner;
import classhero.*;
import equipment.*;
import system.element.*;

public class main {
    Scanner scan = new Scanner(System.in);
    public hero player1;
    public hero player2;
    public int pilihan;
    public String pilihanstr;

    public hero getPlayer1() {
        return player1;
    }

    public void setPlayer1(hero player1) {
        this.player1 = player1;
    }

    public hero getPlayer2() {
        return player2;
    }

    public void setPlayer2(hero player2) {
        this.player2 = player2;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    public String getPilihanstr() {
        return pilihanstr;
    }

    public void setPilihanstr(String pilihanstr) {
        this.pilihanstr = pilihanstr;
    }

    public void mainmenu() {
        System.out.println("====================================");
        System.out.println("Battle Game");
        System.out.println("1 vs 1 Mode");
        System.out.println("====================================");
        System.out.println("1. Main");
        System.out.println("0. Exit");
        System.out.print("Pilih Salah satu : ");

        setPilihan(scan.nextInt());
        if (getPilihan() == 1) {

        } else if (getPilihan() == 0) {
            System.exit(0);
        } else {
            System.out.println("pilihan anda salah");
            mainmenu();
        }
    }

    public void tarung(hero player1, hero player2) {
        System.out.println("\n-------Player 1-------");
        player1.checkStatus();
        player1.spawnIntro();
        System.out.println("\n-------Player 2-------");
        player2.checkStatus();
        player2.spawnIntro();
        System.out.println("\n--------FIGHT BEGIN--------");
        int counter = 1;

        while (true) {
            System.out.println("\n--------Round " + counter + "--------");
            counter++;
            System.out.println("\n--------Player 1 Turn--------");
            player1.attack(player2);
            player2.checkBattleStat("Player 2");
            if (player1.lifestatus() == false) {
                System.out.println("\nPlayer 1 Has Been Defeated");
                System.out.println("\nPlayer 2 WIN");
                break;
            } else if (player2.lifestatus() == false) {
                System.out.println("\nPlayer 2 Has Been Defeated");
                System.out.println("\nPlayer 1 WIN");
                break;
            }
            System.out.println("\n--------Player 2 Turn--------");
            player2.attack(player1);
            player1.checkBattleStat("player 1");
            if (player1.lifestatus() == false) {
                System.out.println("\nPlayer 1 Has Been Defeated");
                System.out.println("\nPlayer 2 WIN");
                break;
            } else if (player2.lifestatus() == false) {
                System.out.println("\nPlayer 2 Has Been Defeated");
                System.out.println("\nPlayer 1 WIN");
                break;
            }
        }
    }

    public static void main(String[] args) {
        main core = new main();
        Scanner scan = new Scanner(System.in);

        Element api = new api();
        Element air = new air();

        core.mainmenu();

        weapon gun1 = new gun("Phantom", 1000);
        weapon gun2 = new gun("Vandal", api, 1500);

        weapon sword2 = new sword("Knife", 500);
        weapon sword1 = new sword("Sword", air, 800);
    

        armor armor1 = new armor(5000);
        armor armor2 = new armor(100000, api);

        System.out.println("====================================");
        System.out.println("|\t\t\t\t   |");
        System.out.println("|\tPlayer 1\t   |");
        System.out.println("|\tChar Selection\t   |");
        System.out.println("|\t\t\t\t   |");
        System.out.println("====================================");
        System.out.println("1. Assasin");
        System.out.println("2. Mage");
        System.out.println("3.Tank");
        System.out.print("Pilih Salah satu : ");
        core.setPilihan(scan.nextInt());
        switch (core.getPilihan()) {
            case 1:
                System.out.print("Masukkan Level Character : ");
                assasin Player1ASS = new assasin(scan.nextInt());
                System.out.println("1. Phantom");
                System.out.println("2. Vandal");
                System.out.println("3. Knife");
                System.out.println("4. Sword");
                System.out.println("0. None");
                System.out.print("Pilih senjata yang ingin digunakan : ");
                core.setPilihan(scan.nextInt());
                switch (core.getPilihan()) {
                    case 1:
                        Player1ASS.useWeapon(gun1);
                        break;
                    case 2:
                        Player1ASS.useWeapon(gun2);
                        break;
                    case 3:
                        Player1ASS.useWeapon(sword1);
                        break;
                    case 4:
                        Player1ASS.useWeapon(sword2);
                        break;
                    case 0:
                        break;
                    default:
                        break;
                }
                core.setPlayer1(Player1ASS);
                break;

            case 2:
                System.out.println("masukkan level karakter :");
                mage player1mage = new mage(scan.nextInt());
                core.setPlayer1(player1mage);
                break;

            case 3:
                System.out.print("Masukkan Level Character : ");
                tank Player1tank = new tank(scan.nextInt());
                System.out.println("1. Guardian Helmet");
                System.out.println("2. Athena Shield");
                System.out.println("0. None");
                System.out.print("Pilih senjata yang ingin digunakan : ");
                scan.nextInt();
                switch (core.getPilihan()) {
                    case 1:
                        Player1tank.useArmor(armor1);
                        break;
                    case 2:
                        Player1tank.useArmor(armor2);
                        break;
                    case 0:

                        break;
                    default:
                        break;
                }
                core.setPlayer1(Player1tank);
                break;
            default:
                break;
        }

        System.out.println("====================================");
        System.out.println("|\t\t\t\t   |");
        System.out.println("|\tPlayer 2\t   |");
        System.out.println("|\tChar Selection\t   |");
        System.out.println("|\t\t\t\t   |");
        System.out.println("====================================");
        System.out.println("1. Assasin");
        System.out.println("2. Mage");
        System.out.println("3.Tank");
        System.out.print("Pilih Salah satu : ");
        core.setPilihan(scan.nextInt());

        switch (core.getPilihan()) {
            case 1:
                System.out.print("Masukkan Level Character : ");
                assasin Player2ASS = new assasin(scan.nextInt());
                System.out.println("1. Vandal");
                System.out.println("2. Phantom");
                System.out.println("3. knife");
                System.out.println("4. sword");
                System.out.println("0. None");
                System.out.print("Pilih senjata yang ingin digunakan : ");
                core.setPilihan(scan.nextInt());
                switch (core.getPilihan()) {
                    case 1:
                        Player2ASS.useWeapon(gun1);
                        break;
                    case 2:
                        Player2ASS.useWeapon(gun2);
                        break;
                    case 3:
                        Player2ASS.useWeapon(sword1);
                        break;
                    case 4:
                        Player2ASS.useWeapon(sword2);
                        break;
                    case 0:
                        break;
                    default:
                        break;
                }
                core.setPlayer2(Player2ASS);
                break;

            case 2:
                System.out.print("Masukkan Level Character : ");
                mage Player2MG = new mage(scan.nextInt());
                core.setPlayer2(Player2MG);
                break;

            case 3:
                System.out.print("Masukkan Level Character : ");
                tank Player2TNK = new tank(scan.nextInt());
                System.out.println("1. Guardian Helmet");
                System.out.println("2. Athena Shield");
                System.out.println("0. None");
                System.out.print("Pilih senjata yang ingin digunakan : ");
                core.setPilihan(scan.nextInt());
                switch (core.getPilihan()) {
                    case 1:
                        Player2TNK.useArmor(armor1);
                        break;
                    case 2:
                        Player2TNK.useArmor(armor2);
                        break;
                    case 0:

                        break;
                    default:
                        break;
                }
                core.setPlayer2(Player2TNK);
                break;
            default:
                break;

        }

        core.tarung(core.getPlayer1(), core.getPlayer2());
        System.out.println("Coba lagi? (y/n)");
        core.setPilihanstr(scan.next());
        if (core.getPilihanstr().equalsIgnoreCase("y")) {
            main(null);
        } else {
            System.out.println("Terimakasih sudah Coba Game yang bikin stress ini");
            scan.close();
            System.exit(0);
        }
    }
}
