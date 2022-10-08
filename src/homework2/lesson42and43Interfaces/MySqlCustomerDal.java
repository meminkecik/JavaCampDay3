package homework2.lesson42and43Interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("MySql eklendi.");
    }
}
