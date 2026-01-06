
package empmgt.controller;

import empmgt.model.Employee;
import empmgt.service.EmployeeService;

public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.save(e);
        return emp;
    } 
}
