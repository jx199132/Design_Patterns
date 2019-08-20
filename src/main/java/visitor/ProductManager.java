package visitor;

import java.util.Random;

/**
 * 产品经理
 */
public class ProductManager extends Element {

    private int productNumber = new Random().nextInt(10);

    public ProductManager(String name) {
        super(name);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // 一年的产品数
    public Integer getProductNumber(){
        return productNumber;
    }
}
