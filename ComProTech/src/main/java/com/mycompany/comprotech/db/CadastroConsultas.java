/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprotech.db;

/**
 *
 * @author lucas
 */
public class CadastroConsultas {
    private int codigo;
    private String paciente, medico, DtConsulta, HoraIni, HoraFim;
    
    //construtor padrão
    public CadastroConsultas(){}
                            //nome, sexo, cpf, endereco, email, telefone, idade
    public CadastroConsultas(String paciente, String medico, String DtConsulta, String HoraIni, String HoraFim){        
        this.paciente = paciente;
        this.medico = medico;
        this.DtConsulta = DtConsulta;
        this.HoraIni = HoraIni;
        this.HoraFim = HoraFim;             
    }
    
    public String getPaciente() {
        return paciente;
    }
    
    public String getMedico() {
        return medico;
    }
    
    public String getDtConsulta() {
        return DtConsulta;
    }
    
    public String getHoraIni(){
        return HoraIni;
    }
    
    public String getHoraFim() {
        return HoraFim;
    }

}
