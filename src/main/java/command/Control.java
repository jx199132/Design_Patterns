package command;

//可以看作是遥控器Invoker
public class Control {
	
	private CommandOn onCommand;
	private CommandOff offCommand;
	private CommandChange changeChannel;

	public Control(CommandOn on, CommandOff off, CommandChange channel) {
		onCommand = on;
		offCommand = off;
		changeChannel = channel;
	}

	public void turnOn() {
		onCommand.execute();
	}

	public void turnOff() {
		offCommand.execute();
	}

	public void changeChannel(int channel) {
		changeChannel.setChannel(channel);
		changeChannel.execute();
	}
}