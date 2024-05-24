/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;

/**
 *
 * @author lucas
 */
public class CadastroUsuario {
    private int codigo, idade;
    private String login, senha, nome, sexo, cpf, tipo, email;
    //private String senha;
    
    //construtor padrão
    public CadastroUsuario(){}
    
    public CadastroUsuario(String login, String senha, String nome, String sexo, String cpf, String tipo, String email, int idade){
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.tipo = tipo;
        this.idade = idade;
        this.email = email;
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public Integer getIdade() {
        return idade;
    }
    
    public String getEmail() {
        return email;
    }
}
