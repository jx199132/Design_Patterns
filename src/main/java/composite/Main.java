package composite;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("boss");

        Employee employee1 = new Employee();
        employee1.setName("总经理");

        employee.setSubordinates(Arrays.asList(employee1));

    }

}
