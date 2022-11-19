public class Main {
    public static void main(String[] args) {
        //For(Sayaç tanımı;Şart;Artış;)
        //girip arttırıyor
        for(int i=2;i<10;i+=2){
            System.out.println(i);
        }
System.out.println(" For Döngüsü bitti");


        //While
        int i=1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println(" While Döngüsü bitti");

        //do while
        //şart uymasa bile 1 kere çalışır
        int j=1;
        do{
            System.out.println("Loglandı");
            System.out.println(j);
            j++;
        }
        while (j<10);
        System.out.println(" Do-While Döngüsü bitti");

    }

}