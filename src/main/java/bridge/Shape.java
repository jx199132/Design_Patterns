package bridge;

/**
 * 形状
 */
public abstract class Shape {
    protected Color color;

    protected String name;

    public void Shape(Color color){
        this.color = color;
    }

    public abstract void draw();
}
