package command;

//关机命令
public class CommandOff implements Command {
	private Tv tv;

	public CommandOff(Tv tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.turnOff();
	}
}