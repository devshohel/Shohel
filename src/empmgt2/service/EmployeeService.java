
package empmgt2.service;

import empmgt2.dao.EmployeeDAO;
import empmgt2.model.Employee;
        
public class EmployeeService {
    public Employee save(Employee e){
    EmployeeDAO edao = new EmployeeDAO();
    return edao.insert(e);
    }
}
