/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import repository.UserJpaRepository;

/**
 *
 * @author A685844
 */
@Component("loggingComponent")
public class LoginComponent {
    
    @Autowired
    @Qualifier("jpaUserRepository")
    private UserJpaRepository users;
    
    public boolean anyUser(){
        boolean anyUser=false;
        if(!users.findAll().isEmpty())
            anyUser = true;
        return anyUser;
    }
    
    public boolean isAdmin(String das){
        if(users.findByDas(das).getRol().intValue()==0)
            return true;
        return false;
    }
    
    public int validateUser(String das, String pwd){
        Users usu= users.findByDas(das);
        if(usu.getPwd().equals(pwd))
            return usu.getRol().intValue();
        return -1;
    }
    
    public Users getUser(String das){
        return users.findByDas(das);
    }
}
