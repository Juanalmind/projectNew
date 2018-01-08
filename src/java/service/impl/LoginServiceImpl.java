/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import model.UsersModel;
import org.springframework.stereotype.Service;
import service.LoginService;
import entities.Users;
import repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
/**
 *
 * @author A685844
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserJpaRepository userRepository;

    @Override
    public UsersModel authenticate(String das, String pwd) {
        Base64.Encoder encoder = Base64.getEncoder();
        Users user = userRepository.findByDas(das);
        String pwdCodified = encoder.encodeToString(pwd.getBytes(StandardCharsets.UTF_8) );
        if (pwdCodified.equals(user.getPwd())) {
            UsersModel userToReturn = new UsersModel(user.getDas(), user.getNombre(), user.getApellido1(), user.getApellido2(), user.getPwd(), user.getStatus().intValue(), user.getRol().intValue());
            return userToReturn;
        }
        return null;
    }

    @Override
    public boolean firstAccess(Users user){
        return user.getStatus().intValue()==2;
    }

    @Override
    public Users changePwd(Users user, String newPwd) {
        if(firstAccess(user)){
            user.setPwd(newPwd);
            return userRepository.saveAndFlush(user);
        }
        return null;
    }
    
}
