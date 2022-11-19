public  class ProductValidator {
    static {
        System.out.println("Static Yapıcı blok çalıştı");//static çağrılınca çalışır
    }
    public  ProductValidator(){
        System.out.println("Yapıcı blok");//static çağrılınca çalışmaz
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }//staticler class isamiyle çĞRILIR VE oluşturulur çağrılınca uygulama baştan başlatılana kadar da tutulur.
        else{return false;}


    }
    public void BirSey(){

        public static void Sil(){


        }

    }
}
