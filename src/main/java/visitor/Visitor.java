package visitor;

/**
 * 访问者接口
 */
public interface Visitor {
    /**
     * 访问工程师
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问产品经理
     * @param productManager
     */
    void visit(ProductManager productManager);
}
