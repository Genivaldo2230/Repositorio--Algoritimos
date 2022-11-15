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
public class Main {

    public static void main(String[] args) {
        Leao leao = new Leao();
        leao.setNome("Mufasa");
        leao.setPeso(110.5);
        leao.setIdade(8);
        
        Leao leao2 = new Leao();
        leao2.setNome("Simba");
        leao2.setPeso(108.5);
        leao2.setIdade(3);
        
        System.out.println("Leão 1: Nome:"+leao.getNome()+", Idade:"+leao.getIdade()+", Peso:"+leao.getPeso());
        System.out.println("Leão 2: Nome:"+leao2.getNome()+", Idade:"+leao2.getIdade()+", Peso:"+leao2.getPeso());
        System.out.println("************************************************************************************");
        System.out.println("Leão 1 corre um pouco");
        leao.correr();
        System.out.println("Leão 1: Nome:"+leao.getNome()+", Idade:"+leao.getIdade()+", Peso:"+leao.getPeso());
        System.out.println("************************************************************************************");
        System.out.println("Leão 2 come um pouco");
        leao2.comer();
        System.out.println("Leão 2: Nome:"+leao2.getNome()+", Idade:"+leao2.getIdade()+", Peso:"+leao2.getPeso());
        
    }
    
}
