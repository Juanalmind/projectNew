/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

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
    public Users authenticateUser(String das, String pwd) {
        Base64.Encoder encoder = Base64.getEncoder();
        Users user = userRepository.findByDas(das);
        String pwdCodified = encoder.encodeToString(pwd.getBytes(StandardCharsets.UTF_8) );
        if (pwdCodified.equals(user.getPwd())) {
            
            return user;
        }
        return null;
    }

    @Override
    public boolean firstAccessUser(Users user){
        return user.getStatus().intValue()==2;
    }

    @Override
    public Users changePwdUser(Users user, String newPwd) {
        Base64.Encoder encoder = Base64.getEncoder();
        String pwdCodified = encoder.encodeToString(newPwd.getBytes(StandardCharsets.UTF_8) );
        if(firstAccessUser(user)){
            user.setPwd(pwdCodified);
            return userRepository.saveAndFlush(user);
        }
        return null;
    }
    
    @Override
    public boolean isActiveUser(String das){
        Users user = userRepository.findByDas(das);
        int status =user.getStatus().intValue();
        return status!=2?
                true:(status==1?
                    true:false);
    }
    
    
}
