package homework1;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

}