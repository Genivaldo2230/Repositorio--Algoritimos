/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dev.lojainformatica.Model;

/**
 *
 * @author Leo
 */
public class Computador {

    private int idComputador;
    private static String marca = "LeonardoMoreno";
    private String hd;
    private String processador;

    public Computador() {
    }
    
     public Computador(int idComputador,String hd,String processador) {
         this.idComputador = idComputador;   
         this.hd = hd;
         this.processador = processador;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

}
