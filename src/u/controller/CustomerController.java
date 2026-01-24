/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u.controller;

import u.model.Customer;
import u.service.CustomerService;


/**
 *
 * @author ahamm
 */
public class CustomerController {

    public int create(Customer c){
        return new CustomerService().save(c);
    }

    public Customer checkLogin(Customer c) {
        return new CustomerService().checkLogin(c);
    }

}
