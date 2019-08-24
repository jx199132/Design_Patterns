package flyweight;

import java.util.HashMap;

/**
 * 图形工厂
 */
public class CircleFactory {
	
	private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();

	public static Circle getCircle(String color) {
		Circle circle = circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
	
}