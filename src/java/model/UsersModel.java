/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author A685844
 */
public class UsersModel {
    
    private String das;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String pwd;
    private int status;
    private int rol;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public UsersModel(String das, String nombre, String apellido1, String apellido2, String pwd, int status, int rol) {
        this.das = das;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.pwd = pwd;
        this.status = status;
        this.rol = rol;
    }

    public UsersModel() {
    }
    
    
}
