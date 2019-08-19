package composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 员工
 */
@Getter
@Setter
public class Employee {

    private String name;

    /**
     * 下属员工
     */
    public List<Employee> subordinates;
}
