public class Main {
    public static void main(String[] args) {
    ICustomerDAL customerDAL=new InMemoryCustomerDAL();
    CustomerManager customerManager=new CustomerManager(new InMemoryCustomerDAL());
    customerManager.ınMemoryCustomerDAL=new InMemoryCustomerDAL();



    }
}
