public class CustomerManager {
    private ICustomerDal customerDal;
    public void add(){
        //iş kodları yazılır


        public CustomerManager(ICustomerDal  customerDal){
            this.customerDal=customerDal;

        }



        public void add(){
            customerDal.Add();
        }
    }

}
