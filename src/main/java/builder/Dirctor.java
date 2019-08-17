package builder;

public class Dirctor {
	
	private Builder builder;
	
	public Dirctor(Builder builder){
		this.builder = builder;
	}
	
	public void editDoc(){
		builder.makeTitle("编写标题");
		builder.makeString("编写字符串");
		builder.makeItem("编写条目");
		String result = builder.close();//编写结束
		System.out.println(result);
	}
}