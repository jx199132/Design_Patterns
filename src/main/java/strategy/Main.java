package strategy;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("相加");
		Context c = new Context(new OperationAdd());
		int i = c.executeStrategy(10, 20);
		System.out.println(i);
		System.out.println("----");
		System.out.print("相减");
		c = new Context(new OperationSubstract());
		i = c.executeStrategy(10, 20);
		System.out.println(i);
		System.out.println("----");
		System.out.print("相乘");
		c = new Context(new OperationSubstract());
		i = c.executeStrategy(10, 20);
		System.out.println(i);
	}
	
}