import java.util.List;

public interface ICustomerDAL {
    void add();
    void  delete();
    void  update();
      List<Customer> getAll();
    void  getById();



}
