/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Users;
import model.UsersModel;

/**
 *
 * @author A685844
 */
public interface LoginService {

    public Users authenticateUser(String das, String pwd);

    public boolean firstAccessUser(Users user);

    public Users changePwdUser(Users user, String newPwd);
    
    public boolean isActiveUser(String das);

}
