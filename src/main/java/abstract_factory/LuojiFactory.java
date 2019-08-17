package abstract_factory;

public class LuojiFactory extends AbsFactory {

    private final String type = "luoji";

    @Override
    public void getMouseAndBoard() {
        Mouse mouse = new Mouse(this.type);
        KeyBoard keyBoard = new KeyBoard(this.type);
        System.out.println("鼠标：" + mouse.getType() + " : 键盘：" + keyBoard.getType());
    }
}
