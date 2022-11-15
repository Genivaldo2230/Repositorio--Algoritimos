/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leonardomoreno;

/**
 *
 * @author Leonardo Moreno
 */

public class Leao {
    
    public String nome;
    public int idade;
    public double peso;
    
    public Leao(){
    }
    
    public Leao(String _nome,int _idade,double _peso){
        this.nome = _nome;
        this.idade = _idade;
        this.peso = _peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void comer(){
        this.peso += 1;
    }
    
    public void correr(){
        this.peso -= 1;
    }
    
}
