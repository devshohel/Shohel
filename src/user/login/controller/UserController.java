
package user.login.controller;

import user.login.service.UserService;
import user.login.model.User;


public class UserController {
    public int create(User u){
   
        return new UserService().save(u);
    
    }

    public User checkLogin(User u) {
        return new UserService().checkLogin(u);
    }
}
