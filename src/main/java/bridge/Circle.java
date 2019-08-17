package bridge;

public class Circle extends Shape {

    public Circle(){
        this.name = "正方形";
    }

    @Override
    public void draw() {
        color.bepaint(this);
    }
}
