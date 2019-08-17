package builder;

public class HTMLBuilder extends Builder{
	
	private StringBuffer buff = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		buff.append("<title>");
		buff.append(title);
		buff.append("</title>\n");
	}

	@Override
	public void makeString(String string) {
		buff.append("<string>");
		buff.append(string);
		buff.append("</string>\n");
	}

	@Override
	public void makeItem(String item) {
		buff.append("<item>");
		buff.append(item);
		buff.append("</item>\n");
	}

	@Override
	public String close() {
		return buff.toString();
	}

}