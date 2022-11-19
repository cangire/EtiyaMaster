public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManager=new BaseKrediManager[]
        {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        for(BaseKrediManager krediManager1 : krediManager)
        System.out.println(ogretmenKrediManager.hesapla(1000));

    }
}
