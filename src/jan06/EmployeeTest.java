
package jan06;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(101, "Walinur", 30000, 25);
        Employee e2 = new Employee(102, "Akib", 35000, 28);
        Employee e3 = new Employee(103, "Sammo", 45000, 30);

        list.add(e1);
        list.add(e2);
        list.add(e3);

        for (Employee e : list) {
            e.display();
        }
    }
}

