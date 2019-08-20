package visitor;

public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 ：" + engineer.name + " 的考核情况 ====>  " +
                                     "kpi : " + engineer.kpi + "， codelines ：" + engineer.getCodeLines());
    }

    @Override
    public void visit(ProductManager productManager) {
        System.out.println("产品经理：" + productManager.name + " 的考核情况 ====>  " +
                                     "kpi : " + productManager.kpi + "， productNumber ：" + productManager.getProductNumber());
    }
}
