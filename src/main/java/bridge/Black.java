package bridge;

public class Black implements Color {
    @Override
    public void bepaint(Shape shape) {
        System.out.println("黑色的" + shape.name);
    }
}
