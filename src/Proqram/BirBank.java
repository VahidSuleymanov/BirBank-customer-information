package Proqram;

import java.util.Scanner;

import Bank.Bank1;
import Musteriler.Musteriler;

//@SuppressWarnings("unused")
public final class BirBank extends Bank1 {

    public static final String Sari = "\u001B[33m";
    public static final String Yasil = "\u001B[32m";
    public static final String Qirmizi = "\u001B[31m";
    public static final String Ag = "\u001B[37m";
    public static final String Ag2 = "\u001B[47m";
    public static final String Goy = "\u001B[36m";

    Scanner in = new Scanner(System.in);

    String Cod;
    String Cod2;
    String Cod3;

    Boolean bln = false;
    Boolean bln2 = false;
    Boolean bln3 = false;
    boolean bln4 = false;
    static boolean bln5 = false;
    boolean bln9 = false;

    String secim0;
    String secim;
    String secim2;
    String secim3;
    String secim4;
    String secim5;

    public BirBank() {
        Menu0();
    }

    public void Menu0() {
        Clear();
        System.out.println(BankName + "a Xos Geldiniz\n");
        System.out.println("    *MENU*    \n");
        System.out.println("1 - Sifre daxil edin\n0 - Cixis\n");
        Secim();
        secim0 = in.nextLine();
        SW4(secim0);
    }

    public void SW4(String a1) {
        switch (a1) {
            case "1":
                Sifre_daxil_et();
                break;
            case "0":
                Cixis0();
                break;
            default:
                bln5 = true;
                Menu0();
                break;
        }
    }

    public void Sifre_daxil_et() {
        Clear();
        if (bln4) {
            System.out.print("Dogru sifreni daxil edin!!!: ");
            bln4 = false;
        } else
            System.out.print("Sifre daxil edin: ");
        Cod = in.nextLine();
        SW(Cod);
    }

    public void SW(String a1) {
        switch (a1) {
            case "1996":
                bln = true;
                Menu();
                break;
            case "1999":
                bln2 = true;
                Menu();
                break;
            case "1995":
                bln3 = true;
                Menu();
                break;
            default:
                bln4 = true;
                Sifre_daxil_et();
                break;
        }
    }

    public void Menu() {
        Clear();
        if (bln) {
            System.out.println("Vahid Suleymanov Xos Geldiniz\n");
            // bln = false;
        }
        if (bln2) {
            System.out.println("Ilkin Aliyev Xos Geldiniz\n");
            // bln2 = false;
        }
        if (bln3) {
            System.out.println("Aytac Memmedova Xos Geldiniz\n");
            // bln3 = false;
        }
        System.out.println("    *Menu*    \n1 - Axtaris et\n0 - Cixis\n");
        Secim();
        secim = in.nextLine();
        SW2(secim);
    }

    public void SW2(String a1) {
        switch (a1) {
            case "1":
                Axtaris_et();
                break;
            case "0":
                CixisSistem();
                break;
            default:
                bln5 = true;
                Menu();
                break;
        }
    }

    public void Axtaris_et() {
        Clear();
        System.out.println("Axtaris et\n");
        if (bln9) {
            System.out.print("Musteri kodu aktiv deyil!!!: ");
            bln9 = false;
        } else {
            System.out.print("Musteri kodunu daxil edin: ");
        }
        secim4 = in.nextLine();
        SW6(secim4);
    }

    public void SW6(String a1) {
        switch (a1) {
            case "4169":
                Musteriler U1 = new Musteriler("Seymur Muradov", "AA1234567", "1A2B3CD", BankName, 2500, 11.5, Valuta);
                Geriye();
                break;
            case "4269":
                Musteriler U2 = new Musteriler("Aytac Aliyeva", "AA2345672", "1E2GJD6", BankName, 6000, 11.3, Valuta);
                Geriye();
                break;
            case "4369":
                Musteriler U3 = new Musteriler("Ferid Isayev", "AA3456789", "1Y6J3HS", BankName, 3700, 11.6, Valuta);
                Geriye();
                break;
            default:
                bln9 = true;
                Axtaris_et();
                break;
        }
    }

    public void Geriye() {
        System.out.println("\nGeriye\n1 - He\n");
        Secim();
        secim5 = in.nextLine();
        SW7(secim5);
    }

    public void SW7(String a1) {
        switch (a1) {
            case "1":
                Menu();
                break;
            default:
                bln5 = true;
                Geriye();
                break;
        }
    }

    public void CixisSistem() {
        Clear();
        System.out.println("Sistemden cixis etmek isteyirsiniz?");
        System.out.println("       1 - He     2 - Yox\n");
        Secim();
        secim2 = in.nextLine();
        SW3(secim2);
    }

    public void SW3(String a1) {
        switch (a1) {
            case "1":
                bln = false;
                bln2 = false;
                bln3 = false;
                Menu0();
                break;
            case "2":
                Menu();
                break;
            default:
                bln5 = true;
                CixisSistem();
                break;
        }
    }

    public void Cixis0() {
        Clear();
        System.out.println("Cixis etmek isteyirsiniz?");
        System.out.println("   1 - He     2 - Yox\n");
        Secim();
        secim3 = in.nextLine();
        SW5(secim3);
    }

    public void SW5(String a1) {
        switch (a1) {
            case "1":
                End();
                break;
            case "2":
                Menu0();
                break;
            default:
                bln5 = true;
                Cixis0();
                break;
        }
    }

    public void End() {
        Clear();
        System.out.println("Cixis edildi...");
    }

    public static final void Secim() {
        if (bln5) {
            System.out.print("Dogru secim edin!!!: ");
            bln5 = false;
        } else {
            System.out.print("Secim edin: ");
        }
    }

    public static final void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
