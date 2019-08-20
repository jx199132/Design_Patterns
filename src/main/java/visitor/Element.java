package visitor;


import java.util.Random;

/**
 * 元素
 */
public abstract class Element {
    protected String name;
    protected int kpi;

    public Element(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    // 接受访问
    abstract void accept(Visitor visitor);
}
