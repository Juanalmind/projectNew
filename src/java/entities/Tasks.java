/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TASKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")
    , @NamedQuery(name = "Tasks.findByIdTask", query = "SELECT t FROM Tasks t WHERE t.idTask = :idTask")
    , @NamedQuery(name = "Tasks.findByNameTask", query = "SELECT t FROM Tasks t WHERE t.nameTask = :nameTask")
    , @NamedQuery(name = "Tasks.findByDescTask", query = "SELECT t FROM Tasks t WHERE t.descTask = :descTask")
    , @NamedQuery(name = "Tasks.findByMacro", query = "SELECT t FROM Tasks t WHERE t.macro = :macro")
    , @NamedQuery(name = "Tasks.findByState", query = "SELECT t FROM Tasks t WHERE t.state = :state")})
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TASK")
    private BigDecimal idTask;
    @Basic(optional = false)
    @Column(name = "NAME_TASK")
    private String nameTask;
    @Column(name = "DESC_TASK")
    private String descTask;
    @Column(name = "MACRO")
    private String macro;
    @Basic(optional = false)
    @Column(name = "STATE")
    private BigInteger state;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tasks")
    private UsersTasks usersTasks;

    public Tasks() {
    }

    public Tasks(BigDecimal idTask) {
        this.idTask = idTask;
    }

    public Tasks(BigDecimal idTask, String nameTask, BigInteger state) {
        this.idTask = idTask;
        this.nameTask = nameTask;
        this.state = state;
    }

    public BigDecimal getIdTask() {
        return idTask;
    }

    public void setIdTask(BigDecimal idTask) {
        this.idTask = idTask;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public String getMacro() {
        return macro;
    }

    public void setMacro(String macro) {
        this.macro = macro;
    }

    public BigInteger getState() {
        return state;
    }

    public void setState(BigInteger state) {
        this.state = state;
    }

    public UsersTasks getUsersTasks() {
        return usersTasks;
    }

    public void setUsersTasks(UsersTasks usersTasks) {
        this.usersTasks = usersTasks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTask != null ? idTask.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.idTask == null && other.idTask != null) || (this.idTask != null && !this.idTask.equals(other.idTask))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tasks[ idTask=" + idTask + " ]";
    }
    
}
