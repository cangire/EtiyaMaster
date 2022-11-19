import java.util.List;

public class CustomerManager {
    InMemoryCustomerDAL ınMemoryCustomerDAL;
    public CustomerManager(ICustomerDAL customerDAL ){


    }

    public void add(){
        ınMemoryCustomerDAL.add();
    }
    public void delete(){
        ınMemoryCustomerDAL.delete();
    }
    public void getAll(){
        ınMemoryCustomerDAL.getAll();
    }
    public void getById(){
        ınMemoryCustomerDAL.getById();
    }


}
