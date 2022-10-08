package homework2.lesson41AbsractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MsSqlDatabaseManager();
        customerManager.getCustomer();
    }
}
