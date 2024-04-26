/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech;


/**
 *
 * @author lucas
 */
public class UsuarioDAO {
    //tipo de retorno, nome, lista de parametros, corpo
    boolean existe(Usuario u) throws Exception {
        //1. Especificar o comando SQL (SELECT)
        var sql = "SELECT * FROM USUARIOS WHERE login = ? AND  senha = ?";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. Executar o comando
        var rs = ps.executeQuery();
        //6. Tratar o resultado e devolver true ou false
        var usuarioExiste = rs.next();        
        //7. Fechar a conexão
        rs.close();
        ps.close();
        conexao.close();

        return usuarioExiste;
    }    
    //cláusula catch or declare
    void cadastrar(CadastroUsuario c)  throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO USUARIOS (login, senha, nome, sexo, cpf, tipo, email, idade) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, c.getLogin());
        ps.setString(2, c.getSenha());
        ps.setString(3, c.getNome());
        ps.setString(4, c.getSexo());
        ps.setString(5, c.getCpf());
        ps.setString(6, c.getTipo());        
        ps.setString(7, c.getEmail());        
        ps.setInt(8, c.getIdade());        
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }      
}
