package Homework1;

public class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }


    public void save(){
        System.out.println("Müşteri kaydedildi : " + customer.firstName);
    }
    public void delete(){
        System.out.println("Müşteri silindi : " + customer.firstName);
    }
    public void GiveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}
