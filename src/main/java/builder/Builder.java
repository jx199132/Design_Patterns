package builder;

public abstract class Builder {
	
	public abstract void makeTitle(String title);		//编写标题
	
	public abstract void makeString(String string);		//编写字符串
	
	public abstract void makeItem(String item);			//编写条目
	
	public abstract String close();						//完成编写文档
	
}