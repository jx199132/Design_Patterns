package factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("BWM");
        System.out.println(car.getName());

        Car car1 = carFactory.getCar("Audi");
        System.out.println(car1.getName());
    }
}
