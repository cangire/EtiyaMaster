import java.util.ArrayList;
import java.util.List;

public class InMemoryCustomerDAL implements ICustomerDAL{
Customer customer;
List<Customer> customers=new ArrayList<>();
    @Override
    public void add() {
        System.out.println("Eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Silindi");
    }

    @Override
    public void update() {
        System.out.println("Güncellendi");
    }

    @Override
    public List<Customer> getAll() {

        return customers;
    }

    @Override
    public void getById() {

        System.out.println(customer.id);
    }
}
