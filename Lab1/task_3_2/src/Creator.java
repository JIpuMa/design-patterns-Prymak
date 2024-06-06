import java.util.Random;

public class Creator {
    void someOperation() {
        Product p = createProduct();
        p.doSomething();
    }

    public Product createProduct() {
        Random rand = new Random();
        boolean is_product_1 = rand.nextBoolean();
        if (is_product_1) {
            return new Product1();
        }
        else {
            return new Product2();
        }
    }
}
