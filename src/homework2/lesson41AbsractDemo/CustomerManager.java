package homework2.lesson41AbsractDemo;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;
    public CustomerManager(){

    }
    public void getCustomer(){
        baseDatabaseManager.getData();
    }
}
