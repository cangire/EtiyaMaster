public class Main {
    public static void main(String[] args) {

       String ogrenci1="Engin";
        String ogrenci2="derin";
        String ogrenci3="Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);


        String[] ogrenciler=new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        //tercih edilen for yapısı
        for (String ogrenci :ogrenciler){
            System.out.println(ogrenci);
        }
    }
}