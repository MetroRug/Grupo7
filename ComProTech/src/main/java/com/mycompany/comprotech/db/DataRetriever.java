package com.mycompany.comprotech.db;


//import com.mycompany.comprotech.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class DataRetriever {
    public ResultSet getData() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null; 

        try {
            conn = new ConnectionFactory().conectar();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT codigo, login, nome, cpf FROM usuarios"); 

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
    public ResultSet getDataPacientes() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null; 

        try {
            conn = new ConnectionFactory().conectar();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT codigo, nome, Endereco, cpf FROM pacientes"); 

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }    
}    

