package interpreter;

/**
 *  终结符表达式（在这个例子，用来存放数字，或者代表数字的字符）
 */
public class TerminalExpression implements Expression{


    String variable;
    public TerminalExpression(String variable){

        this.variable = variable;
    }
    @Override
    public int interpreter(Context context) {
        //因为要兼容之前的版本
        Integer lookup = context.lookup(this);
        if (lookup == null)
            //若在map中能找到对应的数则返回
            return Integer.valueOf(variable);
        //找不到则直接返回（认为输入的就是数字）
        return lookup;
    }
}
