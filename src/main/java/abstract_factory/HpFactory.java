package abstract_factory;

public class HpFactory extends AbsFactory {

    private final String type = "hp";

    @Override
    public void getMouseAndBoard() {
        Mouse mouse = new Mouse(this.type);
        KeyBoard keyBoard = new KeyBoard(this.type);
        System.out.println("鼠标：" + mouse.getType() + " : 键盘：" + keyBoard.getType());
    }
}
