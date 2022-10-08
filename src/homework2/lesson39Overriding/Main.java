package homework2.lesson39Overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager [] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(100));
        }

    }
}