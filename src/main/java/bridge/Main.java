package bridge;

public class Main {
    public static void main(String[] args) {
        Color color = new Black();
        Shape shape = new Circle();
        shape.color = color;
        shape.draw();
    }
}
