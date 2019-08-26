package command;

//频道切换命令
public class CommandChange implements Command {
	
	private Tv tv;

	private int channel;

	public CommandChange(Tv tv) {
		this.tv = tv;
	}
	
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public void execute() {
		tv.changeChannel(channel);
	}
}