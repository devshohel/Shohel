
package user.login.service;

import user.login.dao.UserDAO;
import user.login.model.User;


public class UserService {
    public int save(User u){
        
        return new UserDAO().insert(u);
    
    }
    
    public User checkLogin(User u){
        return new UserDAO().checkLogin(u);
    }
}

