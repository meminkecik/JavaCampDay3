package homework2.lesson39Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
