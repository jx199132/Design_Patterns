package interpreter;

/**
 * 解释器接口
 */
public interface Expression {
    int interpreter(Context context);//一定会有解释方法
}