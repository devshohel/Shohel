/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u.service;

import u.dao.CustomerDAO;
import u.model.Customer;

/**
 *
 * @author ahamm
 */
public class CustomerService {

    public int save(Customer c) {
        return new CustomerDAO().insert(c);
        
    }
    
    public Customer checkLogin(Customer c){
        return new CustomerDAO().checkLogin(c);
    
    }
    
}
