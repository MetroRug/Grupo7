/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    String host = "pg-37ccf3e6-lucassantana094-fad0.a.aivencloud.com";
    String port = "27917";
    String user = "avnadmin";
    String password = "AVNS_yHXCmGPQoCtS3C44vuy";
    String database = "defaultdb";
    
    //4 partes: tipo de retorno, nome, lista de parâmetros e corpo
    Connection conectar() throws Exception{
        //montar uma string de conexão
        //https://google.com:80/search?q=uva&condicao=chuvosa
        //jdbc:postgresql://host:port/database
        //java10+
        var stringConexao = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, port, database
        );
        return DriverManager.getConnection(
            stringConexao, user, password
        );

    }    
}
