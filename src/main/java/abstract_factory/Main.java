package abstract_factory;

public class Main {
    public static void main(String[] args) {
        AbsFactory factory = AbsFactory.getInstance("hp");
        factory.getMouseAndBoard();
    }
}
