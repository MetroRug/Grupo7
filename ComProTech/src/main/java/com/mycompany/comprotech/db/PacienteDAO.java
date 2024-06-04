/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;

/**
 *
 * @author lucas
 */
public class PacienteDAO {
    public void cadastrar(CadastroPaciente c)  throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO PACIENTES (nome, sexo, cpf, endereco, email, telefone, idade) VALUES(?, ?, ?, ?, ?, ?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
      
        ps.setString(1, c.getNome());
        ps.setString(2, c.getSexo());       
        ps.setString(3, c.getCpf());        
        ps.setString(4, c.getEndereco());
        ps.setString(5, c.getEmail());
        ps.setString(6, c.getTelefone());
        ps.setInt(7, c.getIdade());                
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }    
}
