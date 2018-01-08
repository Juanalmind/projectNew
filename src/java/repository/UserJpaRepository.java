/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entities.Users;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author A685844
 */
@Repository("userJpaRepository")
public interface UserJpaRepository extends JpaRepository<Users, Serializable>{
    //AÑADIR METODOS DE QUERYS

    /**
     *
     * @return
     */
    
    
    @Override
    public List<Users> findAll();
    
    /**
     *
     * @param das
     * @return
     */
    public Users findByDas(String das);
    
}
