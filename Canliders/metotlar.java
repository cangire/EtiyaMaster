package Canliders;

public class metotlar {
    public static void main(String[] args) {
        System.out.println("Merhaba");
        mesajVer("Engin");
        mesajVer("Kerem");
        mesajVer("Murat");
        mesajVer("Halil");
        hesapla();
        topla(6,3);

    }

    public static void mesajVer(String isim) {
        System.out.println("Merhaba" + isim);
    }

    public static void hesapla() {
        System.out.println("Hesaplandı");
    }
    public static int topla(int sayi1,int sayi2) {
        int toplam=sayi1+sayi2;
        System.out.println("Toplam"+toplam);
        return toplam;
    }
    public static double toplananIkıSayininYuzdesi(int sayi1,int sayi2) {
        int toplam=topla(sayi1,sayi2);
        double sonuc=toplam*1/10;
        return  sonuc;
    }
    public static double krediHesapla(double krediMiktari) {
        return  125000;
    }
}
