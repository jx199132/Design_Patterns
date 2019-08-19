package decorator;

/**
 * 装饰文字实现类：在文字前后加上边框
 */
public class SideBorder extends Border{
	
	private char borderChar;
	
	public SideBorder(Display display ,char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}