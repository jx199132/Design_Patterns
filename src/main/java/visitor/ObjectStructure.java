package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 元素结构：用来存储 工程师 和 产品经理，以及一个固定方法（展示员工业务报表）
 */
public class ObjectStructure {

    private List<Element> elements = new LinkedList<>();

    public ObjectStructure(){
        elements.add(new Engineer("A"));
        elements.add(new Engineer("B"));
        elements.add(new Engineer("C"));
        elements.add(new Engineer("D"));

        elements.add(new ProductManager("甲"));
        elements.add(new ProductManager("乙"));
        elements.add(new ProductManager("丙"));
        elements.add(new ProductManager("丁"));
    }

    public void showReport(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void showReport2(Visitor visitor){
        for (Element element : elements) {
            if (visitor instanceof CEOVisitor){
                CEOVisitor ceoVisitor = (CEOVisitor) visitor;
                // doSomething
            }else if (visitor instanceof CTOVisitor){
                CTOVisitor ctoVisitor = (CTOVisitor) visitor;
                // doSomething
            }
        }
    }
}
