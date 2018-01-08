/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author A685844
 */
@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByDas", query = "SELECT u FROM Users u WHERE u.das = :das")
    , @NamedQuery(name = "Users.findByNombre", query = "SELECT u FROM Users u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Users.findByApellido1", query = "SELECT u FROM Users u WHERE u.apellido1 = :apellido1")
    , @NamedQuery(name = "Users.findByApellido2", query = "SELECT u FROM Users u WHERE u.apellido2 = :apellido2")
    , @NamedQuery(name = "Users.findByPwd", query = "SELECT u FROM Users u WHERE u.pwd = :pwd")
    , @NamedQuery(name = "Users.findByStatus", query = "SELECT u FROM Users u WHERE u.status = :status")
    , @NamedQuery(name = "Users.findByRol", query = "SELECT u FROM Users u WHERE u.rol = :rol")
    /*, @NamedQuery(name = "Users.updateUserByDas", query = "UPDATE Users u SET u.pwd = :pwd WHERE u.das = :das")*/})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DAS")
    private String das;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO1")
    private String apellido1;
    @Column(name = "APELLIDO2")
    private String apellido2;
    @Column(name = "PWD")
    private String pwd;
    @Column(name = "STATUS")
    private BigInteger status;
    @Column(name = "ROL")
    private BigInteger rol;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
    private UsersTasks usersTasks;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users1")
    private UsersTasks usersTasks1;
    public Users() {
    }

    public Users(String das) {
        this.das = das;
    }

    public String getDas() {
        return das;
    }

    public void setDas(String das) {
        this.das = das;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    public BigInteger getRol() {
        return rol;
    }

    public void setRol(BigInteger rol) {
        this.rol = rol;
    }

    public UsersTasks getUsersTasks() {
        return usersTasks;
    }

    public void setUsersTasks(UsersTasks usersTasks) {
        this.usersTasks = usersTasks;
    }

    public UsersTasks getUsersTasks1() {
        return usersTasks1;
    }

    public void setUsersTasks1(UsersTasks usersTasks1) {
        this.usersTasks1 = usersTasks1;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (das != null ? das.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.das == null && other.das != null) || (this.das != null && !this.das.equals(other.das))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Users[ das=" + das + " ]";
    }
    
}
