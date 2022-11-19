public class Product {

    public  Product(){
        System.out.println("Yapıcı blok çalıştı");

    }
    public Product(int id,String name,String description,double price,int stockAmount,String renk){
        this.id=id;
        this.price=price;
        this.stockAmount=stockAmount;
        this.description=description;
        this.name=name;
        this.renk=renk;
    }

    //attribute/field

  private int id;
   private String name;
   private String description;
  private double price;
  private int stockAmount;
   private String renk;
    private  String kod;

    //getter
    public int getId(){
        //id yi okuyabilir.
        return  id;

    }
    //setter
    public void setId(int id){
      //  this.id=id; //this içerisinde bulunduğum classtaki id
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }


}