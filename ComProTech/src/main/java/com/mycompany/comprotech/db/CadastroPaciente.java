/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;

/**
 *
 * @author lucas
 */
public class CadastroPaciente {
    private int codigo, idade;
    private String nome, sexo, cpf, endereco, email, telefone;
    //private String senha;
    
    //construtor padrão
    public CadastroPaciente(){}
                            //nome, sexo, cpf, endereco, email, telefone, idade
    public CadastroPaciente(String nome, String sexo, String cpf, String endereco, String email, String telefone, int idade){        
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;        
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
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public Integer getIdade() {
        return idade;
    }
    
    
}
