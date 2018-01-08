/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "USERS_TASKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsersTasks.findAll", query = "SELECT u FROM UsersTasks u")
    , @NamedQuery(name = "UsersTasks.findByIdAdmin", query = "SELECT u FROM UsersTasks u WHERE u.usersTasksPK.idAdmin = :idAdmin")
    , @NamedQuery(name = "UsersTasks.findByIdUser", query = "SELECT u FROM UsersTasks u WHERE u.usersTasksPK.idUser = :idUser")
    , @NamedQuery(name = "UsersTasks.findByIdTask", query = "SELECT u FROM UsersTasks u WHERE u.usersTasksPK.idTask = :idTask")
    , @NamedQuery(name = "UsersTasks.findByIdGroup", query = "SELECT u FROM UsersTasks u WHERE u.idGroup = :idGroup")})
public class UsersTasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersTasksPK usersTasksPK;
    @Column(name = "ID_GROUP")
    private String idGroup;
    @JoinColumn(name = "ID_TASK", referencedColumnName = "ID_TASK", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tasks tasks;
    @JoinColumn(name = "ID_ADMIN", referencedColumnName = "DAS", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;
    @JoinColumn(name = "ID_USER", referencedColumnName = "DAS", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users1;

    public UsersTasks() {
    }

    public UsersTasks(UsersTasksPK usersTasksPK) {
        this.usersTasksPK = usersTasksPK;
    }

    public UsersTasks(String idAdmin, String idUser, BigInteger idTask) {
        this.usersTasksPK = new UsersTasksPK(idAdmin, idUser, idTask);
    }

    public UsersTasksPK getUsersTasksPK() {
        return usersTasksPK;
    }

    public void setUsersTasksPK(UsersTasksPK usersTasksPK) {
        this.usersTasksPK = usersTasksPK;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String idGroup) {
        this.idGroup = idGroup;
    }

    public Tasks getTasks() {
        return tasks;
    }

    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Users getUsers1() {
        return users1;
    }

    public void setUsers1(Users users1) {
        this.users1 = users1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersTasksPK != null ? usersTasksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersTasks)) {
            return false;
        }
        UsersTasks other = (UsersTasks) object;
        if ((this.usersTasksPK == null && other.usersTasksPK != null) || (this.usersTasksPK != null && !this.usersTasksPK.equals(other.usersTasksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UsersTasks[ usersTasksPK=" + usersTasksPK + " ]";
    }
    
}
