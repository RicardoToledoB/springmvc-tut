/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.model;

/**
 *
 * @author usuario
 */
public class Usuario {
    private int usuario_id;
    private String nombre;
    private String apepat;
    private String apemat;
    private String username;
    private String password;
    private int ciudad_id;
    private String estado;
    private String ciudad_nombre;
    public Usuario() {
    }

    public Usuario(int usuario_id, String nombre, String apepat, String apemat, String username, String password, int ciudad_id, String estado,String ciudad_nombre) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
        this.username = username;
        this.password = password;
        this.ciudad_id = ciudad_id;
        this.estado = estado;
        this.ciudad_nombre=ciudad_nombre;
    }

    public String getCiudad_nombre() {
        return ciudad_nombre;
    }

    public void setCiudad_nombre(String ciudad_nombre) {
        this.ciudad_nombre = ciudad_nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }
    
}
