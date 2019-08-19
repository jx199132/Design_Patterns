package decorator;

/**
 * 装饰文字的接口
 */
public abstract class Border extends Display{

	protected Display display;

	public Border(Display display) {
		this.display = display;
	}

}