public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        //stack 101 customerManager ==> heap de karşılığında bir nesne oluşuyor.
        CustomerManager customerManager2=new CustomerManager();
        //stack 102 customerManager==>Heapte ayrı bir nesne olara tutuluyor
        //referans numaralarını eşitlemek için
        customerManager=customerManager2;
        //2.nin referansını 1.ye eşitledik aynı yere gidiyorlar heapte
        //referansı tutan nesne kalmazsa GarbageCollector bellekten siler.new pahalı dikkatli kullanılmalı
        //value primitive type her şey stackte oluşur.
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;//20 yerine 10 a eşitlemiş olduk
        sayi1=30;//10 yerine 30 a eşitledik
        System.out.println(sayi2);

        //diziler referans tip value tip değil o yüzden referansları heapte tutuluyor.
        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;//artık aynı referanhsa sahipler
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }

}
