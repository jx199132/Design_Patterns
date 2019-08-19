package strategy;

/**
 * 上下文：策略的执行者
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {//执行策略
		return strategy.doOperation(num1, num2);
	}
}