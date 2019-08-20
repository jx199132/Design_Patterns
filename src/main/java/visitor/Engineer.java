package visitor;

import java.util.Random;

/**
 * 工程师
 */
public class Engineer extends Element {

    private int codeLines = new Random().nextInt(10 * 10000);

    public Engineer(String name) {
        super(name);
    }

    // 工程师一年的代码数量
    public int getCodeLines() {
        return codeLines;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
