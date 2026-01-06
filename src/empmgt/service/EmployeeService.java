
package empmgt.service;

import empmgt.model.Employee;
import empmgt.dao.EmployeeDAO;

public class EmployeeService {
    public Employee save(Employee e){
        EmployeeDAO edao = new EmployeeDAO();
        return edao.insert(e);
    }
}
