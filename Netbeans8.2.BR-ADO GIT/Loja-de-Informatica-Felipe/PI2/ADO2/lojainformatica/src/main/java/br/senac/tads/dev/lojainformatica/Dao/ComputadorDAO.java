/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dev.lojainformatica.Dao;

import br.senac.tads.dev.lojainformatica.Model.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class ComputadorDAO {
    
    //Dados para conexão com banco
    public static String url="jdbc:mysql://localhost:3306/lojainformatica" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    
    public static boolean salvar(Computador pc){
        
        boolean retorno = false;
        Connection conexao = null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //ativa a conexao
            conexao = DriverManager.getConnection(url,login,senha);
            //prepara o comando do banco no caso insert
            PreparedStatement comandoSQL =  conexao.prepareStatement("INSERT INTO computador (processador, marca, hd ) values (?,?,?) ");
            comandoSQL.setString(1, pc.getProcessador());
            comandoSQL.setString(2,pc.getMarca());
            comandoSQL.setString(3,pc.getHd());
            
            //verifica as linhas de retorno
            int linhasAfetadas = comandoSQL.executeUpdate();
            //se o retorno for maior que 0 sucesso
            if(linhasAfetadas>0){
                retorno = true;
            }else{
                retorno = false;
                throw new Exception("Não foi possível inserir o computador");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        } catch(Exception ex){
            System.out.println("Erro:" + ex.getMessage());
            retorno = false;
        }
    
        return retorno;
    }
 
    public static ArrayList<Computador> listarComputadores(){
    
        Connection conexao = null;
        ArrayList<Computador> listaRetorno = new ArrayList<Computador>();
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            //  Prepara o comando no caso select 
            PreparedStatement sql = conexao.prepareStatement("Select * FROM computador");
            //executa o comando
            rs = sql.executeQuery();
            
            //Vai percorrer o resultado da busca
            while(rs.next()){
                //instacia um novo obj
                Computador objComputador = new Computador();
                //preenche o objc
                objComputador.setIdComputador(rs.getInt("idComputador"));
                objComputador.setProcessador(rs.getString("processador"));
                //objComputador.setMarca(rs.getString("marca"));
                objComputador.setHd(rs.getString("hd"));
                //add na lista 
                listaRetorno.add(objComputador);
            
            }
            
            
        } catch (Exception e) {
            System.out.println("erro ao listar computadores");
        }finally{
            
            try {
                if(rs!=null){
                    rs.close();
                }
                if(conexao!=null){
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
            
        return listaRetorno;
    }
    
    public static ArrayList<Computador> listarComputadoresPorProcessador(String processador){
    
        Connection conexao = null;
        ArrayList<Computador> listaRetorno = new ArrayList<Computador>();
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            //Prepar o comando para o slect por processador
            PreparedStatement sql = conexao.prepareStatement("Select * FROM computador WHERE processador like ?");
            sql.setString(1,  processador + '%');
            
            rs = sql.executeQuery();
            //Percorre o resultado para preencher o resultado
            while(rs.next()){            
                //Instacia um objeto
                Computador objComputador = new Computador();
                //Preenche o obj
                objComputador.setIdComputador(rs.getInt("idComputador"));
                objComputador.setProcessador(rs.getString("processador"));
                //objComputador.setMarca(rs.getString("marca"));
                objComputador.setHd(rs.getString("hd"));
                //add o obj na lista
                listaRetorno.add(objComputador);
            
            }
            
            
        } catch (Exception e) {
            System.out.println("erro ao listar computadores");
        }finally{
            
            try {
                if(rs!=null){
                    rs.close();
                }
                if(conexao!=null){
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
            
        return listaRetorno;
    }
    
    public static Computador consultarComputador(int idComputador){
    
        Connection conexao = null;
        Computador objComputador = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            //Prepara o select com where  
            PreparedStatement sql = conexao.prepareStatement("Select * FROM computador WHERE idComputador = ?");
            sql.setInt(1, idComputador);
            
            rs = sql.executeQuery();
            
            while(rs.next()){
                //instacia o obj
                objComputador = new Computador();
                //preenche o obj
                objComputador.setIdComputador(idComputador);
                objComputador.setProcessador(rs.getString("processador"));
                //objComputador.setMarca(rs.getString("marca"));
                objComputador.setHd(rs.getString("hd"));
            }
            
            
        } catch (Exception e) {
            System.out.println("erro ao procurar o Computador");
        }finally{
            
            try {
                if(rs!=null){
                    rs.close();
                }
                if(conexao!=null){
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
            
        return objComputador;
    }
    
    public static boolean excluir(int idComputador){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            //prepara o delte
            PreparedStatement sql = conexao.prepareStatement("DELETE FROM computador WHERE idComputador=?");
            sql.setInt(1, idComputador);
            
            int linhasAfetadas= sql.executeUpdate();
            //verfica se teve  ao menos uma linha afetada 
            if(linhasAfetadas>0){
                retorno = true;
            }else{
                retorno = false;
            }
            
        } catch (Exception e) {
            System.out.println("erro ao excluir cliente");
        }finally{
            
            try {

                if(conexao!=null){
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
            
        return retorno;
    }
    
    public static boolean atualizar(Computador objComputador){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement sql = conexao.prepareStatement("UPDATE computador SET processador=?, marca=?, hd=? WHERE idComputador=?");
            sql.setString(1, objComputador.getProcessador());    
            sql.setString(2, objComputador.getMarca());
            sql.setString(3, objComputador.getHd());
            sql.setInt(4, objComputador.getIdComputador());
            
            int linhasAfetadas= sql.executeUpdate();
            
            if(linhasAfetadas>0){
                retorno = true;
            }else{
                retorno = false;
            }
            
        } catch (Exception e) {
            System.out.println("erro ao alterar computador");
        }finally{
            
            try {

                if(conexao!=null){
                    conexao.close();
                }
            } catch (Exception e) {
            }
        }
            
        return retorno;
    }
    
}
