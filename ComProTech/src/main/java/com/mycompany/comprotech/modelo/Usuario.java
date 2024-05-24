/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.modelo;

/**
 *
 * @author lucas
 */
public class Usuario {
    private int codigo;
    private String login, senha;
    private int tipo;
    //private String senha;
    
    //construtor padrão
    public Usuario(){}
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }    
}
