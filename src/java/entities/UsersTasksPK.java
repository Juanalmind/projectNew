/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author A685844
 */
@Embeddable
public class UsersTasksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_ADMIN")
    private String idAdmin;
    @Basic(optional = false)
    @Column(name = "ID_USER")
    private String idUser;
    @Basic(optional = false)
    @Column(name = "ID_TASK")
    private BigInteger idTask;

    public UsersTasksPK() {
    }

    public UsersTasksPK(String idAdmin, String idUser, BigInteger idTask) {
        this.idAdmin = idAdmin;
        this.idUser = idUser;
        this.idTask = idTask;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public BigInteger getIdTask() {
        return idTask;
    }

    public void setIdTask(BigInteger idTask) {
        this.idTask = idTask;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        hash += (idUser != null ? idUser.hashCode() : 0);
        hash += (idTask != null ? idTask.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersTasksPK)) {
            return false;
        }
        UsersTasksPK other = (UsersTasksPK) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        if ((this.idTask == null && other.idTask != null) || (this.idTask != null && !this.idTask.equals(other.idTask))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsersTasksPK[ idAdmin=" + idAdmin + ", idUser=" + idUser + ", idTask=" + idTask + " ]";
    }
    
}
