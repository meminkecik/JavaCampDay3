package homework2.lesson45StaticDemo;

public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Eklenemedi.");
        }

    }
}