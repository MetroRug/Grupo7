/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas
 */
public class UsuarioDAO {
    //tipo de retorno, nome, lista de parametros, corpo
    boolean existe(Usuario u) throws Exception {
        //1. Especificar o comando SQL (SELECT)
        var sql = "SELECT * FROM tb_usuario_psc_quinta WHERE login = ? AND  senha = ?";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.login);
        ps.setString(2, u.senha);
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
}
