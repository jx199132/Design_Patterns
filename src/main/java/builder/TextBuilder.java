package builder;

public class TextBuilder extends Builder {

	private StringBuffer buff = new StringBuffer();
	
	@Override
	public void makeTitle(String title) {
		buff.append("标题开始");
		buff.append("\n");
		buff.append(title);
		buff.append("\n");
		buff.append("标题结束\n");
	}

	@Override
	public void makeString(String string) {
		buff.append("string开始");
		buff.append("\n");
		buff.append(string);
		buff.append("\n");
		buff.append("string结束\n");
	}

	@Override
	public void makeItem(String item) {
		buff.append("item开始");
		buff.append("\n");
		buff.append(item);
		buff.append("\n");
		buff.append("item结束\n");
	}

	@Override
	public String close() {
		return buff.toString();
	}
}