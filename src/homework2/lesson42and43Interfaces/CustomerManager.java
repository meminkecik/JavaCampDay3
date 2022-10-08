package homework2.lesson42and43Interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        customerDal.add();
        // iş kodları buraya yazılır.

    }
}
