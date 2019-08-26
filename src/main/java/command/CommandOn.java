package command;

//开机命令
public class CommandOn implements Command {
	private Tv tv;

	public CommandOn(Tv tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.turnOn();
	}
}