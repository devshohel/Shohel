
package empmgt2.controller;

import empmgt2.model.Employee;
import empmgt2.service.EmployeeService;

public class EmployeeController {
    public Employee create(Employee e){
    EmployeeService es = new EmployeeService();
    Employee emp = es.save(e);
    return emp;
    }
}
