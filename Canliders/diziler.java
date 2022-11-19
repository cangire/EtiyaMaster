package Canliders;

public class diziler {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogreni2="Berkay";
        System.out.println(ogrenci1);

        String[] sehirler1=new String[]{"Ankara","İstanbul","İzmir"};
        for (String sehir : sehirler1){
            System.out.println(sehir);
        }
        for(int i=0;i<3;i++){
            System.out.println(sehirler1[i]);
        }
        String[] sehirler3=new String[]{"Ankara","İstanbul","İzmir"};
        sehirler1=new String[4];

        String[] sehirler2=new String[]{
                "Antep","diyarbakır","Urfa"
        };
        sehirler3=sehirler2;
        sehirler3[0]="Adana";
        System.out.println(sehirler2[0]);

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);
    }
}
