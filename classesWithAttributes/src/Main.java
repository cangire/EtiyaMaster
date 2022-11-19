public class Main {
    public static void main(String[] args) {
        Product product2=new Product(5,"","",3.0,5,"sarı");
        Product product=new Product();
        ProductManager productManager=new ProductManager();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.getId();
productManager.Add2(1,",","",2,4); //yanlış kullanım yeni özellik eklenince her yerde değişiklik yapılmak zorunda propertyde kızmaz
        productManager.Add(product);
        System.out.println();
    }
}
