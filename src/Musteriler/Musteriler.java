package Musteriler;
import Bank.Bank1;

public class Musteriler extends Bank1{

    public static final String Sari = "\u001B[33m";
    public static final String Yasil = "\u001B[32m";
    public static final String Qirmizi = "\u001B[31m";
    public static final String Ag = "\u001B[37m";
    public static final String Ag2 = "\u001B[47m";
    public static final String Goy = "\u001B[36m";

    String fullName;
    String SVseria;
    String Finkod;
    String Bank = BankName;
    int Kredit;
    double KreditFaiz = Faiz;
    String Pulvahidi = Valuta;

    // @SuppressWarnings("static-access")
    public Musteriler(String fullName, String SVseria, String Finkod, String Bank, int Kredit, double KreditFaiz, String Pulvahidi) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        this.fullName = fullName;
        this.SVseria = SVseria;
        this.Finkod = Finkod;
        this.Bank = Bank;
        this.Kredit = Kredit;
        this.KreditFaiz = KreditFaiz;
        this.Pulvahidi = Pulvahidi;

        System.out.println(Sari+"A.S.A: " +Ag+this.fullName);
        System.out.println(Sari+"S/V seriasi: " +Ag+this.SVseria);
        System.out.println(Sari+"S/V fin kod: " +Ag+this.Finkod);
        System.out.println(Sari+"Bank adi: "+Ag+this.Bank);
        System.out.println(Sari+"Goturduyu kredit: "+Ag+this.Kredit);
        System.out.println(Sari+"Kredit faizi: "+Ag+this.KreditFaiz);
        System.out.println(Sari+"Pul vahidi: "+Ag+this.Pulvahidi);
    }

    /*
     * public void Print(){
     * System.out.println("Ad: "+this.ad);
     * System.out.println("Soyad: "+this.soyad);
     * System.out.println("Yas: "+this.yas);
     * }
     */
}
