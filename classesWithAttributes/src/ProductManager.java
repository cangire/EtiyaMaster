public class ProductManager {
    //Single responsibilty olmalı hem attribute tutup hem operasyoları içermemeli bir sınıf
    public void Add(Product product){
        //JDBC
        System.out.println("Ürün eklendi"+product.name);
    }
    public  void Add2(int id,String name,String description,int stockAmount,double Price){

    }
}
