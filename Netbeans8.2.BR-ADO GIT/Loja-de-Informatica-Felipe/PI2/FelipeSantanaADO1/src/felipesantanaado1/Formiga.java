
package felipesantanaado1;

public class Formiga {

    public String nome;
    public int idade;
    public boolean hiberna;

    public Formiga() {

    }

    public Formiga(String nome, int idade, boolean hiberna) {
        this.nome = nome;
        this.idade = idade;
        this.hiberna = hiberna;
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

    public boolean isHiberna() {
        return hiberna;
    }

    public void setHiberna(boolean hiberna) {
        this.hiberna = hiberna;
    }

    public void inverno() {
        this.hiberna = true;
    }

    public void verao() {
        this.hiberna = false;
    }

}
