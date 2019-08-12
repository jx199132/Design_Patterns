package prototype;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Car car = new Car("大众");
        Person p1 = new Person(car);
        Person p2 = (Person) p1.clone();
        Person p3 = (Person) p1.deepClone();


        System.out.println("p1 car : " + p1.getCar().getName());
        System.out.println("p2 car : " + p2.getCar().getName());
        System.out.println("p3 car : " + p3.getCar().getName());


        car.setName("本田");
        System.out.println("p1 car : " + p1.getCar().getName());
        System.out.println("p2 car : " + p2.getCar().getName());
        System.out.println("p3 car : " + p3.getCar().getName());
    }
}
