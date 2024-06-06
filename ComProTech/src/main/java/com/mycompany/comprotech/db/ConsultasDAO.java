/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;

/**
 *
 * @author lucas
 */
public class ConsultasDAO {
    public void cadastrar(CadastroConsultas c)  throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO CONSULTAS (Paciente, Medico, DtConsulta, HoraIni, HoraFim) VALUES(?, ?, ?, ?, ?)";
        //2. Estabelecer uma conexão com o banco
        var conexao = new ConnectionFactory().conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
      
        ps.setString(1, c.getPaciente());
        ps.setString(2, c.getMedico());       
        ps.setString(3, c.getDtConsulta());        
        ps.setString(4, c.getHoraIni());
        ps.setString(5, c.getHoraFim());        
        //5. Executar o comando
        ps.execute();
        //6. Fechar a conexão
        conexao.close();
    }        
}
