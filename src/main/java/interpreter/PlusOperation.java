package interpreter;

/**
 *  加法表达式实现类
 */
public class PlusOperation extends NonTerminalExpression {

    public PlusOperation(Expression e1, Expression e2) {
        super(e1, e2);
    }

    //将两个表达式相加
    @Override
    public int interpreter(Context context) {
        return this.e1.interpreter(context) + this.e2.interpreter(context);
    }
}
