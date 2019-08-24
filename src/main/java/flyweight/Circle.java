package flyweight;

/**
 * 圆形类
 */
public class Circle{
	private String color;

	public Circle(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color);
	}
}