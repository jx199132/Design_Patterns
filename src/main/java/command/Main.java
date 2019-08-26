package command;

public class Main {

	public static void main(String[] args) {
		// 命令接收者Receiver
		Tv tv = new Tv();
		// 开机命令ConcreteCommond
		CommandOn on = new CommandOn(tv);
		// 关机命令ConcreteCommond
		CommandOff off = new CommandOff(tv);
		// 频道切换命令ConcreteCommond
		CommandChange channel = new CommandChange(tv);
		// 命令控制对象Invoker
		Control control = new Control(on, off, channel);

		// 开机
		control.turnOn();
		// 切换频道
		control.changeChannel(1);
		// 切换频道
		control.changeChannel(2);
		// 关机
		control.turnOff();
	}

}