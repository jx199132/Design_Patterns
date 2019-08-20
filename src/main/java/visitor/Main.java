package visitor;

public class Main {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        CEOVisitor ceo = new CEOVisitor();
        System.out.println("ceo考核");
        objectStructure.showReport(ceo);
        System.out.println();

        CTOVisitor cto = new CTOVisitor();
        System.out.println("cto考核");
        objectStructure.showReport(cto);
    }
}
