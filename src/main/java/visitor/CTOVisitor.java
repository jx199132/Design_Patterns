package visitor;

public class CTOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + " ， 代码行数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(ProductManager productManager) {
        System.out.println("产品经理：" + productManager.name + "，产品数量：" + productManager.getProductNumber());
    }
}
