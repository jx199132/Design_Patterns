package strategy;

/**
 * 增加策略
 */
public class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}